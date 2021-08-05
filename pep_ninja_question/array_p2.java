package pep_ninja_question;
// write a program to find out wheather a given integer is present or not in an array
public class array_p2 {

	public static void main(String[] args) {
		float [] marks= {45.7f,34.4f,23.4f,23.9f,99.99f};
		float num=23.9f;
		boolean isInArray =false;
		for(int i=0;i<marks.length;i++){
            if(num==marks[i]){
                isInArray = true;
                break;
            }
        }
		if(isInArray) {
			System.out.println("present");
		}
		else {
			System.out.println("not present");
		}
		}

	}


