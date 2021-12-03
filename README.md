<details>
  <summary>简体中文</summary>

  # 进行第一次<ruby>代码重构<rt>Code Refactoring</rt></ruby>

  软件工程的一个重要原则是复用代码，不要反复编写重复的代码，即<ruby>不要重复你自己<rt>Don't Repeat Yourself</rt></ruby>，简称DRY。
  在Java中，我们通过将重复的逻辑抽取成公用方法来实现代码的复用。
  在[src/main/java/com/bytelegend/Challenge.java](https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/src/main/java/com/bytelegend/Challenge.java)中的`main`方法中，你可以看到相似的逻辑被重复了许多次。
  请尝试将公用逻辑抽取到`print`方法中，以实现功能完全不变，但是代码变得更加简洁明了、容易阅读和维护。
  这被称为<ruby>代码重构<rt>Code Refactoring</rt></ruby>。

  在重构之后，`main`方法应该被极大地简化为：

  ```
  public static void main(String[] args) {
      print(a);
      print(b);
      print(c);
  }
  ```

  - 你可以使用任意一种方法完成挑战（最好先在自己的本地电脑上测试通过）：
    - 使用下面的网页编辑器。
    - 创建一个GitHub Pull Request。
  - 机器人将会检查你的回答，告诉你是否通过了挑战。
  - 回到[字节传说](https://bytelegend.com)，然后继续你的英雄旅程。

  **注意：我们只允许您修改以下文件，任何对其他文件的修改都会被拒绝：**

- `src/main/java/com/bytelegend/Challenge.java`
    </details>

<details open='true'>
  <summary>English</summary>

  # Your First Code Refactoring

  Code reuse is a very important principle in software engineering. This is also called "Don't Repeat Yourself", DRY.
  In Java, we extract similar logic into common methods to reuse code.
  In `main` method of [src/main/java/com/bytelegend/Challenge.java](https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/src/main/java/com/bytelegend/Challenge.java) you can see a lot of similar logic duplicated.
  Please extract the common logic into `print` method, in order to make code easier to read and maintain
  without any functionality change. This is called code refactoring.

  After the refactoring, `main` method should be simplified a lot:

  ```
  public static void main(String[] args) {
      print(a);
      print(b);
      print(c);
  }
  ```

  - You can use either way to accomplish the challenge (you'd better test it on your local computer):
    - Use the web editor below.
    - Create a GitHub Pull Request.
  - The bot will check your PR and tell you if you accomplish the challenge.
  - Go back to [ByteLegend](https://bytelegend.com) and continue your hero journey.

  **Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:**

- `src/main/java/com/bytelegend/Challenge.java`
</details>
