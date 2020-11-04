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
        //help from kyra mccarrick. my shifting them to the left didn't work properly. she explained it to me.
        for (int i=0; i<arr.length; i++){
            if (arr[i]==item){
                for(int j=i; j<arr.length-1; j++){
                    arr[j]=arr[j+1];
                }
            }
        }
    }
    public String toString(){
        String gList="Grocery List: ";
        for (int i=0; i<arr.length; i++){
            gList+=arr[i]+" ";
        }
        return gList;
    }
}