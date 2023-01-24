class Ex6_example_17 {

  static int[] shuffle1(int[] arr) {
    for(int x=0;x<arr.length;x++){
      int i = (int)(Math.random()*arr.length);
      int j =
          (int)(Math.random()*arr.length);

      int tmp = arr[i];
      arr[i] = arr[j];
      arr[j] = tmp;
    }
    return arr;
  }


  public static void main(String[] args) {
    int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    System.out.println(java.util.Arrays.toString(original));

    int[] result = shuffle1(original);
    System.out.println(java.util.Arrays.toString(result));
  }
}
