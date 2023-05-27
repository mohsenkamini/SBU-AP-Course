import 'package:ap1401_flutter_tutorial/models/todo.dart';
import 'package:flutter/material.dart';

class TodoDetailScreen extends StatelessWidget {
  const TodoDetailScreen({
    required this.todo,
  });
  final Todo todo;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(todo.title),
        actions: [
          Container(
            padding: EdgeInsets.symmetric(horizontal: 15),
            child: InkWell(
              onTap: () {
                Navigator.of(context).pop(todo.id);
              },
              child: Icon(
                Icons.delete,
              ),
            ),
          ),
        ],
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Text('description: ' + todo.description),
            if (todo.createdAt != null) Text('created at: ' + todo.createdAt!.toString()),
            if (todo.type != null) Text('type: ' + todo.type!.name)
          ],
        ),
      ),
    );
  }
}
