public class TestIsSubString {
    
    private static boolean isSubString(String item, String line) {
        int        i, j;
        boolean    found = false;
        
        for ( i = 0; (i < line.length()) && !found; i++ ) {
            j = 0;
            found = false;
            while ( ! found ) {
                if ( j >= item.length() ) {
                    break;
                } else if ( (i + j) >= line.length() ) {
                    break;
                } else if ( item.charAt(j) != line.charAt(i + j) ) {
                    break;
                } else {
                    j++;
                    if ( j == item.length() ) {
                        found = true;
                    }
                }
            }
        }
        
        return found;
    }
    
    public static void main(String[] args) {
        String text = "The cat in the hat.";
        
        System.out.println("isSubString(\"cat\", \"The cat in the hat.\") "
                + isSubString("cat", text));
        
        System.out.println("isSubString(\"bat\", \"The cat in the hat.\") "
                + isSubString("bat", text));
        
        System.out.println("isSubString(\"The\", \"The cat in the hat.\") "
                + isSubString("The", text));
        
        System.out.println("isSubString(\"hat.\", \"The cat in the hat.\") "
                + isSubString("hat.", text));
        
    }
}
