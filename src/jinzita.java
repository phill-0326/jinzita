public class jinzita {
    public static void main(String[] args) {
        int totalLevel = 10;
        for (int i = 1;i <= totalLevel;i++){ //i 表示层数

            for (int k = 1;k <= totalLevel-i;k++){//打印每层的空格个数=总层数-当前层
                System.out.print(" ");
            }

            for (int j =1;j <=2*i -1;j++) {//打印每层的*的个数
                //当j=每一层的第一个和最后一个或者层数等于5的时候输出*，否则输出空格
                if (j== 1 || j==2*i-1 || i==totalLevel){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
