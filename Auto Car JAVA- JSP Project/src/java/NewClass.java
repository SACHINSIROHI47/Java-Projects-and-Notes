import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
        public class NewClass {
            public static void main(String args []){
               NumberFormat formatter = NumberFormat.getInstance();
               System.out.println(formatter.getCurrency());
               Currency germany =Currency.getInstance(Locale.US);
               System.out.println("currency symbol of Germany:"+germany.getSymbol());
               
               String pattern="yyy-mm-dd";
               SimpleDateFormat simpleDateFormat=new SimpleDateFormat(pattern);
               String date=simpleDateFormat.format(new Date());
               System.out.println(date);
            }
    
}
