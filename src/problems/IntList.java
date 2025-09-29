package problems;

public class IntList {
    public int first;
    public IntList rest;

    public int size(){
        if(rest == null){
            return 1;
        }
        return 1 + this.rest.size();
    }

    public int iterartiveSize() {
        IntList p = this;
        int totalSize = 0;
        while (p != null) {
            totalSize += 1;
            p = p.rest;
        }
        return totalSize;
    }
}
