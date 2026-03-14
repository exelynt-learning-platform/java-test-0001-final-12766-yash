public class test1 {
   public test1() {
   }

   public static void main(String[] var0) {
      byte var1 = 5;

      for(int var2 = 1; var2 <= var1; ++var2) {
         for(int var3 = var2; var3 < var1; ++var3) {
            System.out.print(" ");
         }

         System.out.print("*");
         if (var2 > 1) {
            for(int var5 = 1; var5 <= 2 * var2 - 3; ++var5) {
               System.out.print(" ");
            }

            System.out.print("*");
         }

         System.out.println();
      }

      for(int var4 = var1 - 1; var4 >= 1; --var4) {
         for(int var6 = var1; var6 > var4; --var6) {
            System.out.print(" ");
         }

         System.out.print("*");
         if (var4 > 1) {
            for(int var7 = 1; var7 <= 2 * var4 - 3; ++var7) {
               System.out.print(" ");
            }

            System.out.print("*");
         }

         System.out.println();
      }

   }
}
