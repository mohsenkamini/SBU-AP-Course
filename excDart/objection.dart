import 'dart:io';  


main() {
    //print("Hello");
    var kString = stdin.readLineSync();
    int k=0;
    if (kString != null)
      k = int.parse(kString);
    String? tempInput=stdin.readLineSync();
    List tempParams = tempInput!.split(' ');
    if (tempParams.length >= k)
      print("Score Changed!");
    else
      print("Score Did Not Change!");

}