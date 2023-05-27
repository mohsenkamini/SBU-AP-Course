import 'package:ap1401_flutter_tutorial/models/todo.dart';
import 'package:ap1401_flutter_tutorial/pages/forms/add_todo_form.dart';
import 'package:ap1401_flutter_tutorial/pages/screens/todo_detail_screen.dart';
import 'package:ap1401_flutter_tutorial/widgets/todo_view.dart';
import 'package:flutter/material.dart';

class TodosScreen extends StatefulWidget {
  const TodosScreen({Key? key}) : super(key: key);

  @override
  State<TodosScreen> createState() => _TodosScreenState();
}

class _TodosScreenState extends State<TodosScreen> {
  List<Todo> todos = [];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('ToDo list'),
      ),
      body: todos.isNotEmpty
          ? ListView.builder(
              itemCount: todos.length,
              itemBuilder: (context, index) {
                final todo = todos[index];
                return TodoView(
                  todo: todo,
                  onTap: () {
                    moveToDetailScreen(context, todo);
                  },
                );
              },
              // separatorBuilder: (_, __) {
              //   return Divider(height: 5);
              // },
            )
          : Center(
              child: Text('Please Add a todo'),
            ),
      floatingActionButton: FloatingActionButton(
        child: Icon(Icons.add),
        onPressed: () async {
          final result = await Navigator.of(context).push(
            MaterialPageRoute(
              builder: (_) {
                return AddTodoForm(
                  length: todos.length,
                );
              },
            ),
          );
          if (result is Todo) {
            setState(() {
              todos.add(result);
            });
          }
        },
      ),
    );
  }

  void moveToDetailScreen(BuildContext context, Todo todo) async {
    final result = await Navigator.of(context).push(
      MaterialPageRoute(
        builder: (context) {
          return TodoDetailScreen(
            todo: todo,
          );
        },
      ),
    );
    if (result is int) {
      setState(() {
        todos.removeWhere((Todo e) {
          return e.id == result;
        });
      });
    }
  }
}
