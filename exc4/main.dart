
import 'dart:io';  
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
    print(studentNames);
    //String strList = "Welcome To Dart World";
    //List params = strList.split(' '); // [Welcome, To, Dart, World]
    //print(params[1]);
}