import { Component, inject, OnDestroy } from "@angular/core";

import { CommonModule } from "@angular/common";

import { Router, ActivatedRoute, provideRouter, RouterModule } from "@angular/router";

import { bootstrapApplication } from "@angular/platform-browser";

import { Store, provideStore } from "@ngrx/store";

import { createAction, props, createReducer, on } from "@ngrx/store";

import { Subscription } from "rxjs";

interface Product {
  id: number;
  name: string;
  image: string;
  type: string;
  details: string;
}

interface ProductsState {
  selectedProduct: Product | null;
  products: Product[];
}

interface RootState {
  products: ProductsState;
}

const selectProduct = createAction('[Product] Select', props<{ product: Product | null }>());
const deleteProduct = createAction('[Product] Delete', props<{ id: number }>());
const addProduct = createAction('[Product] Add', props<{ product: Omit<Product, 'id'> }>());
const initialState : ProductsState = { selectedProduct: null, products: [{ id: 1, name: 'product 1', image: 'https://via.placeholder.com/100', type: 'type 1', details: 'product detail 1' }, { id: 2, name: 'product 2', image: 'https://via.placeholder.com/100', type: 'type 2', details: 'product detail 2' }, { id: 3, name: 'product 3', image: 'https://via.placeholder.com/100', type: 'type 3', details: 'product detail 3' }] };
const productReducer = createReducer(initialState, on(selectProduct, (state, { product }) => ({ ...state, selectedProduct: product })), on(deleteProduct, (state, { id }) => ({ ...state, products: state.products.filter((p: Product) => p.id !== id), selectedProduct: null })), on(addProduct, (state, { product }) => { const nextId = state.products.length? Math.max (...state.products.map(p => p.id))+1 : 1; return { ...state, products: [...state.products, { id: nextId, ...product }] }; }));
@Component(
  {
  selector: "app-root",
  standalone : true,
  imports : [RouterModule],
  template: `<h1>ProductApp</h1><router-outlet></router-outlet>`
}
)
export class AppComponent {
}
@Component(
  {
  selector: "app-products-list",
  standalone : true,
  imports : [CommonModule],
  template: `<div class="product-list"><h3>ProductList</h3><button (click)="addProduct()" style="margin:10px 0;" > Add>Product</button><div *ngFor="let product of state.products"  (click)="select(product)" (mouseover)="hovered = product.id" (mouseout)="hovered = -1" style="cursor: pointer; border: 1px solid gray; margin: 10px; padding: 10px;"><img [src]="product.image" alt="{{ product.name }}" /><p>{{ product.name }}</p></div></div>`
}
)
export class ProductsListComponent implements OnDestroy {
  private store = inject(Store<RootState>);
  private router = inject(Router);
  hovered = -1;
  state: ProductsState = initialState;
  sub: Subscription;
  constructor() {
  this.sub = this.store.select('products').subscribe(productsState => { this.state = productsState; });}
  
  select(product: Product) {
    this.store.dispatch(selectProduct({ product }));
    this.router.navigate(['/product', product.id]);
  }
  addProduct() {
    const name = prompt('Name?');  if (!name) return;
    const image = prompt('Image URL?', 'https://via.placeholder.com/100')  ?? 'https://via.placeholder.com/100';  const type = prompt('Type?')  ?? '';  const details = prompt('Details?')  ?? '';  this.store.dispatch(addProduct({ product: { name, image, type, details } }));}
  ngOnDestroy() {
    this.sub?.unsubscribe();}
  hoverStyle = { transform: 'scale(1.05)', boxShadow: '0 4px 8px rgba(0,0,0,0.2)' };
}
@Component(
  {
  selector: "app-product-detail",
  standalone : true,
  imports : [CommonModule],
  template: `<div *ngIf="product; else noProduct" class="product-detail"><img [src]="product.image" alt="{{ product.name }}" /><h2>{{ product.name }}</h2><p>{{ product.details }}</p><button (click) = "editProduct()" > Edit></button><button (click) = "deleteProduct(product.id)" > delete></button><button (click) = "goToList()" > Back></button></div><ng-template #noProduct></ng-template>`,
  styles: [`
  .product-detail {
  padding : 20
  px;
}
  .product-detailimg {
  max-width : 200
  px;
}
`]
}
)
export class ProductDetailComponent implements OnDestroy {
  private store = inject(Store<RootState>);
  private router = inject(Router);
  private route = inject(ActivatedRoute);
  product: Product | null = null;
  sub: Subscription;
  constructor() {
  this.sub = this.store.select('products').subscribe(state => { const id = Number (this.route.snapshot.paramMap.get('id')); this.product = state.products.find((p: Product) => p.id === id) || null; });}
  
  deleteProduct(id: number) {
    this.store.dispatch(deleteProduct({ id }));
    this.router.navigate(['/']);
  }
  goToList() {
    this.store.dispatch(selectProduct({ product: null }));  this.router.navigate(['/']);}
  editProduct() {
    alert('edit product : '+this.product?.name);}
  ngOnDestroy() {
    this.sub?.unsubscribe();}
}
const routes = [{ path: '', component: ProductsListComponent }, { path: 'product/:id', component: ProductDetailComponent }];
bootstrapApplication(AppComponent, { providers: [provideStore({ products: productReducer }), provideRouter(routes)] });
