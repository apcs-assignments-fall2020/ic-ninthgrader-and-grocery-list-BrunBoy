public class GroceryList {
    private String[] arr;
    public GroceryList() {
        arr=new String[10];
    }
    public void add(String item){
        for (int i=0; i<arr.length; i++){
            if (arr[i]==null){
                arr[i]=item;
                break;
            }
        }
    }
    public void remove(String item){
        for (int i=0; i<arr.length; i++){
            if (arr[i]==null){
                arr[i]="";
                break;
            }
        }
    }
    public String toString(String item){
        String gList="Grocery List: ";
        for (int i=0; i<arr.length; i++){
            gList+=arr[i]+"";
        }
        return gList;
    }
}