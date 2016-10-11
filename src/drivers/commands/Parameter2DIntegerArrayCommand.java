package drivers.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import util.other.arrayutility.IntegerArrayUtility;

public class Parameter2DIntegerArrayCommand implements ParameterCommand {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int whatMattersArray;
	private  int indexLength = 0;
	private  int indexBredth = 0;
	private int length;
	private int bredth;
	private int min;
	private int max;
	List<Integer> arrayLengthlist;
	List<Integer> arrayBredthlist;

	@Override
	public void menu() {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter choice ");
		System.out.println("1: 2D Array ");

		whatMattersArray = s.nextInt();

		switch (whatMattersArray) {
		case 1:

			System.out.println("Array Length:");
			
			length = s.nextInt();
			System.out.println("Array Bredth:");
			
			bredth = s.nextInt();
			System.out.println("Min Element:");
			
			min = s.nextInt();
			System.out.println("Max Element:");
			
			max = s.nextInt();
			break;

		default:
			break;

		}
		arrayLengthlist = getArrayListLength(length);
		arrayBredthlist = getArrayListLength(bredth);
		s.close();
	}

	public ArrayList<Integer> getArrayListLength(int length) {
		int digitLength = (int) (Math.log10(length));
		switch (digitLength) {
		case 0:
			int count = 0;
			ArrayList<Integer> list = new ArrayList<>();
			while (count <= length) {
				list.add(count);
				count++;
			}
			while (count <= 9) {
				list.add(length);
				count++;
			}
			return list;
		case 1:
			return new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, length));
		case 2:
			return new ArrayList<Integer>(Arrays.asList(1, 10, 30, 40, 50, 60, 70, 80, length));
		case 3:
			return new ArrayList<Integer>(Arrays.asList(1, 10, 20, 50, 75, 100, 250, 500, length));
		case 4:
			return new ArrayList<Integer>(Arrays.asList(1, 10, 20, 50, 100, 500, 1000, 5000, length));
		case 5:
			return new ArrayList<Integer>(Arrays.asList(1, 10, 20, 50, 75, 100, 1000, 10000, length));
		case 6:
			return new ArrayList<Integer>(Arrays.asList(1, 20, 50, 75, 100, 1000, 10000, 100000, length));
		case 7:
			return new ArrayList<Integer>(Arrays.asList(1, 20, 50, 75, 100, 1000, 10000, 100000, length));
		case 8:
			return new ArrayList<Integer>(Arrays.asList(1, 5, 10, 100, 1000, 10000, 100000, 1000000, 10000000, length));
		case 9:
			return new ArrayList<Integer>(
					Arrays.asList(1, 5, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, length));
		default:
			return null;
		}
	}

	public int[][] logic(int number) {
		int currentLength = arrayLengthlist.get(indexLength++);
		int currentBredth = arrayBredthlist.get(indexBredth++);
		switch (number) {
		case 1:
			int arr[][] = new int[currentLength][];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = IntegerArrayUtility.randomArrayGenerator(currentBredth, min, max);
			}
			return arr;
		default:
			return null;
		}

	}

	/**
	 * 2D Array Incomplete
	 */
	@Override
	public boolean execute(ArrayList<String> result) {
		
		int arr[][] = logic(whatMattersArray);
		StringBuilder str = new StringBuilder();
		str.append(arrayLengthlist.get(indexLength-1) + " ");
		str.append(arrayBredthlist.get(indexBredth-1) + " ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				str = str.append(arr[i][j] + " ");
			}

		}
		result.add(str.toString());
		return true;
	}

	@Override
	public void setStatus(boolean b) {

	}

	@Override
	public int[][] read(String line) {
		String[] valueStr = new String(line).trim().split(" ");
		int indx = 0;
		int length = Integer.parseInt(valueStr[indx++]);
		int bredth = Integer.parseInt(valueStr[indx++]);
		int[][] inputArrayParameter = new int[length][bredth];
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < bredth; j++) {
				inputArrayParameter[i][j] = Integer.parseInt(valueStr[indx++]);
			}
		}

		return inputArrayParameter;
	}

}
