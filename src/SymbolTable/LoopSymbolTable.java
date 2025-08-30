package SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class LoopSymbolTable {

    public static class LoopEntry {
        public String loopVariable;
        public boolean hasCondition;
        public boolean hasIncrement;

        public LoopEntry(String loopVariable, boolean hasCondition, boolean hasIncrement) {
            this.loopVariable = loopVariable;
            this.hasCondition = hasCondition;
            this.hasIncrement = hasIncrement;
        }

        @Override
        public String toString() {
            return "LoopVariable: " + loopVariable + ", Condition: " + hasCondition + ", Increment: " + hasIncrement;
        }
    }

    private List<LoopEntry> loops = new ArrayList<>();

    public void addLoop(String loopVar, boolean hasCond, boolean hasInc) {
        loops.add(new LoopEntry(loopVar, hasCond, hasInc));
    }

    public List<LoopEntry> getLoops() {
        return loops;
    }

}