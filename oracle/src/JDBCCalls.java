public class JDBCCalls {
    public static void main(String[] args) throws Exception {
    	
    	DAOClass dao = new DAOClass();

        int option = Integer.parseInt(args[0]);

        switch (option) {
            case 1: // Insert
                dao.insert(Integer.parseInt(args[1]), args[2], args[3], args[4], Double.parseDouble(args[5]));
                break;

            case 2: // Delete
                dao.delete(Integer.parseInt(args[1]));
                break;

            case 3: // Modify
                dao.modify(Integer.parseInt(args[1]), Double.parseDouble(args[2]));
                break;

            case 4: // Display
                if (args.length == 2)
                    dao.display(Integer.parseInt(args[1]));
                else
                    dao.displayAll();
                break;

            default:
                System.out.println("Invalid Option");
        }
    }
}