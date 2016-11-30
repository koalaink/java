import java.util.Scanner;
import javax.swing.JOptionPane;

public class ch0806 {
    public static void main(String[] args) {
        
        PrintCalendar myCalendar = new PrintCalendar() ;

        myCalendar.print() ;

        // JOptionPane.showMessageDialog(null, myCalendar.output);
    }
}

class PrintCalendar{
    int year ;
    int month ;
    // static String output ;
    PrintCalendar(){
        // String yearString = JOptionPane.showInputDialog(null,
        //         "Enter full year (i.e. 2001):", "Enter Year",
        //         JOptionPane.QUESTION_MESSAGE);

        // year = Integer.parseInt(yearString);

        // String monthString = JOptionPane.showInputDialog(null,
        //         "Enter month in number between 1 and 12:", "Enter Month",
        //         JOptionPane.QUESTION_MESSAGE);

        // month = Integer.parseInt(monthString);

        Scanner in = new Scanner(System.in) ;

        System.out.print("Enter Year : ") ;

        year = in.nextInt() ;

        System.out.print("Enter Month: ") ;

        month = in.nextInt() ;

        // JOptionPane.showMessageDialog(null, output);      
    }
    void print(){
        int st = this.getFirst() ;
        String output = "" ;
        output += "      " + monthInEnglish() + ", " + year + "\n" ;
        output += "-------------------------------\n" ;
        output += " Sum Mon Tue Wed Thu Fri Sat\n" ;
        int days = getMonthDays() ;
        int p_day = 1 ;
        for( int i = 0 ; i < st ; ++i ){
            output += "    " ;
        }
        while( st <= 6 ){
            output += "   " + p_day ;
            p_day++ ;
            st++ ;
        }
        output += "\n" ;
        while( true ){
            for( int i = 0 ; i < 7 ; ++i ){
                output += "  " + (p_day<10?(" "+p_day):(p_day)) ;
                p_day++ ;
                if( p_day > days )
                    break ;
            }
            output += "\n" ;
            if( p_day > days )
                break ;
        }
        System.out.println(output);
    }
    int getFirst(){
        int c ;
        int y ;
        int m ;
        int d = 1 ;
        if( month >= 3 ){
            m = month ;
            if( year % 100 == 0 )
                c = year/100 - 1 ;
            else
                c = year/100 ;
            y = year%100 ;
        }
        else{
            m = 12 + month ;
            if( year % 100 == 0 )
                c = year/100 - 1 ;
            else
                c = year/100 ;
            y = (year-1)%100 ;
        }
        int w = y + y/4 + c/4 - 2*c + 26*(m+1)/10 + d - 1 ;
        w = w % 7 ;
        if( w < 0 ) w += 7 ;
        return w ;
    }
    String monthInEnglish(){
        String[] m = { "" , "January" , "February" , "March" , "April" , "May" , "June" , "July" , "August" , "September" , "October" , "November" , "December" } ;
        return m[month] ;
    }
    int getMonthDays(){
        if( month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
            return 31 ;
        if( month != 2 )
            return 30 ;
        if( year % 4 == 0 && ( year % 100 != 0 || year % 400 == 0 ) )
            return 29 ;
        return 28 ;
    }
}