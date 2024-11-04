class CSVGenerator{
    public static String generateCSV(String[] headers, String[][] data) {
        StringBuilder csv = new StringBuilder();

        csv.append(String.join(",", headers)).append('\n');
        for (String[] row : data){
            csv.append(String.join(",", row)).append('\n');
        }
        return csv.toString().trim();
    }
}

public class seminarHomework2{
    public static void main(String[] args) {
        String[] headers = {};
        String[][] data = {};
        if (args.length == 0) {
            headers = new String[]{"Name", "Age", "City"};
            data = new String[][] {
            {"John", "30", "New York"},
            {"Alice", "25", "Los Angeles"},
            {"Bob", "35", "Chicago"}
            };
        }
        CSVGenerator ans = new CSVGenerator();
        System.out.println(ans.generateCSV(headers, data));
            
    }
}
