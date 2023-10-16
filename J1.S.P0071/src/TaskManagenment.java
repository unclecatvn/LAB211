
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 
 * Class này sẽ chứa các hàm để chạy chương trình đồng thời chứa giao diện 
 * sẽ hiển thị lên màn hình cho người dùng tương tác và sử dụng
 */
public class TaskManagenment {
    ArrayList<Task> list = new ArrayList<>();//khởi tạo một list để lưu trữ dữ liệu mà người dùng nhập vào
    Validation v = new Validation();
    Scanner sc = new Scanner(System.in);
   /**
 *
 
 * Hàm này sẽ là phần menu hiện lên đầu tiên khi người dùng sử dụng chương trình gồm các 
 * option cho người dùng lựa chọn là : ADD, DELETE, DISPLAY, EXIT
 * 
 */ 
    public void menu(){
        System.out.println("1. ADD TASK");
        System.out.println("2. DELETE TASK");
        System.out.println("3. DISPLAY TASK");
        System.out.println("4. EXIT");
        int choice = v.getChoice("Enter your choice: ");
        switch(choice){
            case 1:
                addTask();
                break;
            case 2:
                int id=v.getID();
                deleteTask(id);
                break;

            case 3: 
                displayTask();
                break;
            case 4:
                System.exit(0);
        }
    }
   
//   option 1 của hệ thống

    public void addTask(){
        int id;
        if(list.isEmpty()){// nếu trong hệ thống chưa có dữ liệu thì dữ liệu đầu tiên nhập vào sẽ có id = 1
            id = 1;
        }else{// những id sau đó sẽ được cộng thêm 1 đơn vị sau mỗi lần nhập thêm dữ liệu
            id = list.get(list.size() - 1).getId() + 1;
        }
        String name = v.getText("Enter name: ");
        int typeid = v.getChoice("Enter type id: ");
        String date = v.getDate();
        double from = v.getFrom();
        double to = v.getTo(from);
        String assign = v.getText("Enter assignee: ");
        String reviewer = v.getText("Enter reviewer: ");
        Task t = new Task(id, name, typeid, date, from, to, assign, reviewer);
        list.add(t);
        System.out.println("Add successfully!");
    }
    /**
  
 *  option 2 của chương trình là xóa dữ liệu mà người dùng yêu cầu khi nhập vào chương trình
 */
    public void deleteTask(int id){
        boolean check = false;//tạo biến check để kiểm tra xem task mà người dùng muốn delete có tồn tại trong hệ thống hay không ?
        for(Task t : list){//vong for này sẽ check toàn bộ dữ liệu mà người dùng đã nhập vào hệ thống 
            if(t.getId() == id){//nếu task người dùng nhập vào trùng với task trong hệ thống thì sẽ delete được task đó đi
                check = true;
                list.remove(t);
                System.out.println("Done !!!");
                break;
            }
        }
        if(check == false){//nếu task đó chưa được khai báo trong hệ thống thì chương trình sẽ gửi thông báo không tìm thấy
            System.out.println("Not found !!!");
        }
    }
    /**
 *
 
 *  Hiển thị tất cả các task mà người dùng đã nhập vào trong quá trình sử dụng chương trình
 */
    public void displayTask(){
        if (list.isEmpty()){
            System.out.println("There is nothing here.");
        }else{
        System.out.println("DISPLAY ALL TASK: ");
        for(Task t : list){
            System.out.println(t);
        }
    }}
}
