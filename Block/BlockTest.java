class BlockTest{
       BlockTest(){
          System.out.println("This is a Constructor");

        }

      {
       System.out.println(" This is a non static block");

      }
     
      static{
        System.out.println("This is a static block");

       }
     
   
     public static void main(String[] args){
         BlockTest bt=new BlockTest();
     
     

   }



}

//========================================================================================================
//                                    ( STATIC BLOCK )
//declared : If the block of code  is declard with static keyword,It is called static block.
//Used     : Static Block is used for initializing only Static variable & calling any static method.
//Call     : i)static block executes automatically when the class is loaded in memory & it execute before instance block (non static block).
//           ii)The code inside the static block is executed only once when the first time the class is loaded into memory.
//           iii)It executes before first line of main method.
//                execute before or with out main method in JDK 1.6(Java SE 5.0) or previous version) 
//            iv)"this" keyword can't be used in static blocks.
//
//=============================================================================================================

//                               (NON STATIC BLOCK / Instance initializer Block)
//
//declaration : If the block declared without any static keyword , then it is called as non static block.
//Used        : Non Static block is used for initializing instance variable or calling any instance method.
//Call        : i)Non static block are executed after the static block and  before the constructor is called by the user.
//               ii)It executes only when instance of class is created,not called when class is loaded in java.
//              iii)A non static may execute nth number of times as it depends upon the user.
//               iv)"this " keyword can be used in instance block.
                