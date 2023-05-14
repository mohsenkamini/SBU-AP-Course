
import 'dart:io';  

int searchList(String str, List list) {
  for (int i=0 ; i < list.length ; i++)
    if (str == list[i])
      return i;
    
  return -1;
}
bool checkWrong (int qNo , String answers) {
  qNo--;
  if (answers[qNo] == 'W')
    return true;
  return false;
}
bool checkCheated (int qNo, List list) {
  int counter=0;
  qNo--;
  for (int i=0 ; i < list.length; i++)
    if (list[i][qNo] == 'C')
      counter++;
  
  if (counter >= list.length/2)
    return true;

  return false;
}
main() {
    //print("Hello");
    var nString = stdin.readLineSync();
    int n=0;
    if (nString != null)
      n = int.parse(nString);
    List? studentNames = [] ;
    List? studentIds = [];
    List? studentAnswers = [] ;
    String? tempInput ;
    List tempParams = ['1','2','3'];
    for (int i=0 ; i < n ; i++)
    {
      tempInput=stdin.readLineSync();
      tempParams = tempInput!.split(' ');
      studentNames.add(tempParams[0]);
      studentIds.add(tempParams[1]);
      studentAnswers.add(tempParams[2]);
    }
    //print(studentNames);
    var qString = stdin.readLineSync();
    int q=0;
    if (qString != null)
      q = int.parse(qString);

    for (int i=0 ; i < q ; i++)
    {
      tempInput=stdin.readLineSync();
      tempParams = tempInput!.split(' ');
      int nameIndex=searchList(tempParams[0], studentNames);
      int idIndex=searchList(tempParams[0], studentIds);
      if ((nameIndex == -1) && (idIndex == -1))
        print("Student Not Found!");
      else
      {
        int index;
        if (nameIndex > idIndex)    // one of them is -1(not present) and the other is positive or zero
          index=nameIndex;
        else
          index=idIndex;
        //print(int. parse(tempParams[1]));
      print(index);

        if (checkWrong(int.parse(tempParams[1]), studentAnswers[index]))
          print("Wrong!");
        else if (checkCheated(int.parse(tempParams[1]), studentAnswers))
          print("Cheated!");
        else print("Correct!");
      }
    }

    //String strList = "Welcome To Dart World";
    //List params = strList.split(' '); // [Welcome, To, Dart, World]
    //print(params[1]);
}