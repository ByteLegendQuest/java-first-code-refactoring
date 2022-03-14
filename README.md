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

- You can accomplish this challenge via any way below:
  - Recommended for beginners: run `git clone https://github.com/ByteLegendQuest/java-first-code-refactoring` to download the code,
    finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
    - If you don't know how, you can [click here to see detailed docs](https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/docs/en/clone-and-import.md).
  - Very unrecommended: you can [click here to download zipped code](https://codeload.github.com/ByteLegendQuest/java-first-code-refactoring/zip/refs/heads/main) if you don't like `git` operations.
  - Or: if you are confident enough to write code in web editor directly, go ahead.
  - Or: if you are familiar with GitHub, you can fork the repo, finish the challenge and create a pull request.
- The bot will check your PR and tell you if you accomplish the challenge.
- Go back to [ByteLegend](https://bytelegend.com) and continue your hero journey.

Good luck!

If you need any help, feel free to join the [Discord Community](https://discord.gg/35RreUUGWt) or contact us via [contact@bytelegend.com](mailto:contact@bytelegend.com).

**Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:**

- `src/main/java/com/bytelegend/Challenge.java`
</details>
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

- 你可以使用以下任意一种方法完成挑战：
  - 初学者推荐：运行`git clone https://git.bytelegend.com/ByteLegendQuest/java-first-code-refactoring`将代码下载到本地，在本地使用IDE调试完成后复制到网页编辑器里提交。
    - 如果你不知道怎么做，可以点击[这里查看详细文档](https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/docs/zh_hans/clone-and-import.md)。
  - 非常不推荐：如果你实在不喜欢`git`命令行操作，你可以[点击这里直接下载打包好的代码](https://ghcodeload.bytelegend.com/ByteLegendQuest/java-first-code-refactoring/zip/refs/heads/main)。
  - 或者：如果你非常自信不需要下载代码到本地调试，可以使用网页编辑器直接提交。
  - 或者：如果你对GitHub非常熟悉，你可以fork仓库、完成挑战后，创建一个Pull Request。
- 机器人将会检查你的答案，告诉你你是否通过了挑战。
- 回到[字节传说](https://bytelegend.com)，然后继续你的英雄旅程。

祝你好运！

如果你需要任何帮助，欢迎加入官方玩家QQ群（在[首页](https://bytelegend.com)右下角的`联系 & 关于`菜单里可以找到入群方式）或者[Discord社区](https://discord.gg/35RreUUGWt)，或email至[contact@bytelegend.com](mailto:contact@bytelegend.com)。

**注意：我们只允许您修改以下文件，任何对其他文件的修改都会被拒绝：**

- `src/main/java/com/bytelegend/Challenge.java`
</details>
<details>
<summary>繁體中文</summary>

<h1>Your First Code Refactoring</h1>
<p>Code reuse is a very important principle in software engineering. This is also called &quot;Don't Repeat Yourself&quot;, DRY.
In Java, we extract similar logic into common methods to reuse code.
In <code class="notranslate">main</code> method of <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">src/main/java/com/bytelegend/Challenge.java</a> you can see a lot of similar logic duplicated.
Please extract the common logic into <code class="notranslate">print</code> method, in order to make code easier to read and maintain
without any functionality change. This is called code refactoring.</p>
<p>After the refactoring, <code class="notranslate">main</code> method should be simplified a lot:</p>
<pre class="notranslate"><code class="notranslate">public static void main(String[] args) {
    print(a);
    print(b);
    print(c);
}
</code></pre>
<ul>
<li>You can accomplish this challenge via any way below:
<ul>
<li>Recommended for beginners: run <code class="notranslate">git clone https://github.com/ByteLegendQuest/java-first-code-refactoring</code> to download the code,
finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
<ul>
<li>If you don't know how, you can <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/docs/en/clone-and-import.md" target="_blank">click here to see detailed docs</a>.</li>
</ul>
</li>
<li>Very unrecommended: you can <a href="https://codeload.github.com/ByteLegendQuest/java-first-code-refactoring/zip/refs/heads/main" target="_blank">click here to download zipped code</a> if you don't like <code class="notranslate">git</code> operations.</li>
<li>Or: if you are confident enough to write code in web editor directly, go ahead.</li>
<li>Or: if you are familiar with GitHub, you can fork the repo, finish the challenge and create a pull request.</li>
</ul>
</li>
<li>The bot will check your PR and tell you if you accomplish the challenge.</li>
<li>Go back to <a href="https://bytelegend.com" target="_blank">ByteLegend</a> and continue your hero journey.</li>
</ul>
<p>Good luck!</p>
<p>If you need any help, feel free to join the <a href="https://discord.gg/35RreUUGWt" target="_blank">Discord Community</a> or contact us via <a href="mailto:contact@bytelegend.com" target="_blank">contact@bytelegend.com</a>.</p>
<p><strong>Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:</strong></p>
<ul>
<li><code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li>
</ul>
</details>
<details>
<summary>Español</summary>

<h1>Your First Code Refactoring</h1>
<p>Code reuse is a very important principle in software engineering. This is also called &quot;Don't Repeat Yourself&quot;, DRY.
In Java, we extract similar logic into common methods to reuse code.
In <code class="notranslate">main</code> method of <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">src/main/java/com/bytelegend/Challenge.java</a> you can see a lot of similar logic duplicated.
Please extract the common logic into <code class="notranslate">print</code> method, in order to make code easier to read and maintain
without any functionality change. This is called code refactoring.</p>
<p>After the refactoring, <code class="notranslate">main</code> method should be simplified a lot:</p>
<pre class="notranslate"><code class="notranslate">public static void main(String[] args) {
    print(a);
    print(b);
    print(c);
}
</code></pre>
<ul>
<li>You can accomplish this challenge via any way below:
<ul>
<li>Recommended for beginners: run <code class="notranslate">git clone https://github.com/ByteLegendQuest/java-first-code-refactoring</code> to download the code,
finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
<ul>
<li>If you don't know how, you can <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/docs/en/clone-and-import.md" target="_blank">click here to see detailed docs</a>.</li>
</ul>
</li>
<li>Very unrecommended: you can <a href="https://codeload.github.com/ByteLegendQuest/java-first-code-refactoring/zip/refs/heads/main" target="_blank">click here to download zipped code</a> if you don't like <code class="notranslate">git</code> operations.</li>
<li>Or: if you are confident enough to write code in web editor directly, go ahead.</li>
<li>Or: if you are familiar with GitHub, you can fork the repo, finish the challenge and create a pull request.</li>
</ul>
</li>
<li>The bot will check your PR and tell you if you accomplish the challenge.</li>
<li>Go back to <a href="https://bytelegend.com" target="_blank">ByteLegend</a> and continue your hero journey.</li>
</ul>
<p>Good luck!</p>
<p>If you need any help, feel free to join the <a href="https://discord.gg/35RreUUGWt" target="_blank">Discord Community</a> or contact us via <a href="mailto:contact@bytelegend.com" target="_blank">contact@bytelegend.com</a>.</p>
<p><strong>Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:</strong></p>
<ul>
<li><code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li>
</ul>
</details>
<details>
<summary>العربية</summary>

<h1>Your First Code Refactoring</h1>
<p>Code reuse is a very important principle in software engineering. This is also called &quot;Don't Repeat Yourself&quot;, DRY.
In Java, we extract similar logic into common methods to reuse code.
In <code class="notranslate">main</code> method of <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">src/main/java/com/bytelegend/Challenge.java</a> you can see a lot of similar logic duplicated.
Please extract the common logic into <code class="notranslate">print</code> method, in order to make code easier to read and maintain
without any functionality change. This is called code refactoring.</p>
<p>After the refactoring, <code class="notranslate">main</code> method should be simplified a lot:</p>
<pre class="notranslate"><code class="notranslate">public static void main(String[] args) {
    print(a);
    print(b);
    print(c);
}
</code></pre>
<ul>
<li>You can accomplish this challenge via any way below:
<ul>
<li>Recommended for beginners: run <code class="notranslate">git clone https://github.com/ByteLegendQuest/java-first-code-refactoring</code> to download the code,
finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
<ul>
<li>If you don't know how, you can <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/docs/en/clone-and-import.md" target="_blank">click here to see detailed docs</a>.</li>
</ul>
</li>
<li>Very unrecommended: you can <a href="https://codeload.github.com/ByteLegendQuest/java-first-code-refactoring/zip/refs/heads/main" target="_blank">click here to download zipped code</a> if you don't like <code class="notranslate">git</code> operations.</li>
<li>Or: if you are confident enough to write code in web editor directly, go ahead.</li>
<li>Or: if you are familiar with GitHub, you can fork the repo, finish the challenge and create a pull request.</li>
</ul>
</li>
<li>The bot will check your PR and tell you if you accomplish the challenge.</li>
<li>Go back to <a href="https://bytelegend.com" target="_blank">ByteLegend</a> and continue your hero journey.</li>
</ul>
<p>Good luck!</p>
<p>If you need any help, feel free to join the <a href="https://discord.gg/35RreUUGWt" target="_blank">Discord Community</a> or contact us via <a href="mailto:contact@bytelegend.com" target="_blank">contact@bytelegend.com</a>.</p>
<p><strong>Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:</strong></p>
<ul>
<li><code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li>
</ul>
</details>
<details>
<summary>Português</summary>

<h1>Your First Code Refactoring</h1>
<p>Code reuse is a very important principle in software engineering. This is also called &quot;Don't Repeat Yourself&quot;, DRY.
In Java, we extract similar logic into common methods to reuse code.
In <code class="notranslate">main</code> method of <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">src/main/java/com/bytelegend/Challenge.java</a> you can see a lot of similar logic duplicated.
Please extract the common logic into <code class="notranslate">print</code> method, in order to make code easier to read and maintain
without any functionality change. This is called code refactoring.</p>
<p>After the refactoring, <code class="notranslate">main</code> method should be simplified a lot:</p>
<pre class="notranslate"><code class="notranslate">public static void main(String[] args) {
    print(a);
    print(b);
    print(c);
}
</code></pre>
<ul>
<li>You can accomplish this challenge via any way below:
<ul>
<li>Recommended for beginners: run <code class="notranslate">git clone https://github.com/ByteLegendQuest/java-first-code-refactoring</code> to download the code,
finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
<ul>
<li>If you don't know how, you can <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/docs/en/clone-and-import.md" target="_blank">click here to see detailed docs</a>.</li>
</ul>
</li>
<li>Very unrecommended: you can <a href="https://codeload.github.com/ByteLegendQuest/java-first-code-refactoring/zip/refs/heads/main" target="_blank">click here to download zipped code</a> if you don't like <code class="notranslate">git</code> operations.</li>
<li>Or: if you are confident enough to write code in web editor directly, go ahead.</li>
<li>Or: if you are familiar with GitHub, you can fork the repo, finish the challenge and create a pull request.</li>
</ul>
</li>
<li>The bot will check your PR and tell you if you accomplish the challenge.</li>
<li>Go back to <a href="https://bytelegend.com" target="_blank">ByteLegend</a> and continue your hero journey.</li>
</ul>
<p>Good luck!</p>
<p>If you need any help, feel free to join the <a href="https://discord.gg/35RreUUGWt" target="_blank">Discord Community</a> or contact us via <a href="mailto:contact@bytelegend.com" target="_blank">contact@bytelegend.com</a>.</p>
<p><strong>Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:</strong></p>
<ul>
<li><code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li>
</ul>
</details>
<details>
<summary>Bahasa Indonesia</summary>

<h1>Your First Code Refactoring</h1>
<p>Code reuse is a very important principle in software engineering. This is also called &quot;Don't Repeat Yourself&quot;, DRY.
In Java, we extract similar logic into common methods to reuse code.
In <code class="notranslate">main</code> method of <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">src/main/java/com/bytelegend/Challenge.java</a> you can see a lot of similar logic duplicated.
Please extract the common logic into <code class="notranslate">print</code> method, in order to make code easier to read and maintain
without any functionality change. This is called code refactoring.</p>
<p>After the refactoring, <code class="notranslate">main</code> method should be simplified a lot:</p>
<pre class="notranslate"><code class="notranslate">public static void main(String[] args) {
    print(a);
    print(b);
    print(c);
}
</code></pre>
<ul>
<li>You can accomplish this challenge via any way below:
<ul>
<li>Recommended for beginners: run <code class="notranslate">git clone https://github.com/ByteLegendQuest/java-first-code-refactoring</code> to download the code,
finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
<ul>
<li>If you don't know how, you can <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/docs/en/clone-and-import.md" target="_blank">click here to see detailed docs</a>.</li>
</ul>
</li>
<li>Very unrecommended: you can <a href="https://codeload.github.com/ByteLegendQuest/java-first-code-refactoring/zip/refs/heads/main" target="_blank">click here to download zipped code</a> if you don't like <code class="notranslate">git</code> operations.</li>
<li>Or: if you are confident enough to write code in web editor directly, go ahead.</li>
<li>Or: if you are familiar with GitHub, you can fork the repo, finish the challenge and create a pull request.</li>
</ul>
</li>
<li>The bot will check your PR and tell you if you accomplish the challenge.</li>
<li>Go back to <a href="https://bytelegend.com" target="_blank">ByteLegend</a> and continue your hero journey.</li>
</ul>
<p>Good luck!</p>
<p>If you need any help, feel free to join the <a href="https://discord.gg/35RreUUGWt" target="_blank">Discord Community</a> or contact us via <a href="mailto:contact@bytelegend.com" target="_blank">contact@bytelegend.com</a>.</p>
<p><strong>Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:</strong></p>
<ul>
<li><code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li>
</ul>
</details>
<details>
<summary>Français</summary>

<h1>Your First Code Refactoring</h1>
<p>Code reuse is a very important principle in software engineering. This is also called &quot;Don't Repeat Yourself&quot;, DRY.
In Java, we extract similar logic into common methods to reuse code.
In <code class="notranslate">main</code> method of <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">src/main/java/com/bytelegend/Challenge.java</a> you can see a lot of similar logic duplicated.
Please extract the common logic into <code class="notranslate">print</code> method, in order to make code easier to read and maintain
without any functionality change. This is called code refactoring.</p>
<p>After the refactoring, <code class="notranslate">main</code> method should be simplified a lot:</p>
<pre class="notranslate"><code class="notranslate">public static void main(String[] args) {
    print(a);
    print(b);
    print(c);
}
</code></pre>
<ul>
<li>You can accomplish this challenge via any way below:
<ul>
<li>Recommended for beginners: run <code class="notranslate">git clone https://github.com/ByteLegendQuest/java-first-code-refactoring</code> to download the code,
finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
<ul>
<li>If you don't know how, you can <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/docs/en/clone-and-import.md" target="_blank">click here to see detailed docs</a>.</li>
</ul>
</li>
<li>Very unrecommended: you can <a href="https://codeload.github.com/ByteLegendQuest/java-first-code-refactoring/zip/refs/heads/main" target="_blank">click here to download zipped code</a> if you don't like <code class="notranslate">git</code> operations.</li>
<li>Or: if you are confident enough to write code in web editor directly, go ahead.</li>
<li>Or: if you are familiar with GitHub, you can fork the repo, finish the challenge and create a pull request.</li>
</ul>
</li>
<li>The bot will check your PR and tell you if you accomplish the challenge.</li>
<li>Go back to <a href="https://bytelegend.com" target="_blank">ByteLegend</a> and continue your hero journey.</li>
</ul>
<p>Good luck!</p>
<p>If you need any help, feel free to join the <a href="https://discord.gg/35RreUUGWt" target="_blank">Discord Community</a> or contact us via <a href="mailto:contact@bytelegend.com" target="_blank">contact@bytelegend.com</a>.</p>
<p><strong>Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:</strong></p>
<ul>
<li><code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li>
</ul>
</details>
<details>
<summary>日本語</summary>

<h1>Your First Code Refactoring</h1>
<p>Code reuse is a very important principle in software engineering. This is also called &quot;Don't Repeat Yourself&quot;, DRY.
In Java, we extract similar logic into common methods to reuse code.
In <code class="notranslate">main</code> method of <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">src/main/java/com/bytelegend/Challenge.java</a> you can see a lot of similar logic duplicated.
Please extract the common logic into <code class="notranslate">print</code> method, in order to make code easier to read and maintain
without any functionality change. This is called code refactoring.</p>
<p>After the refactoring, <code class="notranslate">main</code> method should be simplified a lot:</p>
<pre class="notranslate"><code class="notranslate">public static void main(String[] args) {
    print(a);
    print(b);
    print(c);
}
</code></pre>
<ul>
<li>You can accomplish this challenge via any way below:
<ul>
<li>Recommended for beginners: run <code class="notranslate">git clone https://github.com/ByteLegendQuest/java-first-code-refactoring</code> to download the code,
finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
<ul>
<li>If you don't know how, you can <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/docs/en/clone-and-import.md" target="_blank">click here to see detailed docs</a>.</li>
</ul>
</li>
<li>Very unrecommended: you can <a href="https://codeload.github.com/ByteLegendQuest/java-first-code-refactoring/zip/refs/heads/main" target="_blank">click here to download zipped code</a> if you don't like <code class="notranslate">git</code> operations.</li>
<li>Or: if you are confident enough to write code in web editor directly, go ahead.</li>
<li>Or: if you are familiar with GitHub, you can fork the repo, finish the challenge and create a pull request.</li>
</ul>
</li>
<li>The bot will check your PR and tell you if you accomplish the challenge.</li>
<li>Go back to <a href="https://bytelegend.com" target="_blank">ByteLegend</a> and continue your hero journey.</li>
</ul>
<p>Good luck!</p>
<p>If you need any help, feel free to join the <a href="https://discord.gg/35RreUUGWt" target="_blank">Discord Community</a> or contact us via <a href="mailto:contact@bytelegend.com" target="_blank">contact@bytelegend.com</a>.</p>
<p><strong>Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:</strong></p>
<ul>
<li><code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li>
</ul>
</details>
<details>
<summary>Русский</summary>

<h1>Your First Code Refactoring</h1>
<p>Code reuse is a very important principle in software engineering. This is also called &quot;Don't Repeat Yourself&quot;, DRY.
In Java, we extract similar logic into common methods to reuse code.
In <code class="notranslate">main</code> method of <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">src/main/java/com/bytelegend/Challenge.java</a> you can see a lot of similar logic duplicated.
Please extract the common logic into <code class="notranslate">print</code> method, in order to make code easier to read and maintain
without any functionality change. This is called code refactoring.</p>
<p>After the refactoring, <code class="notranslate">main</code> method should be simplified a lot:</p>
<pre class="notranslate"><code class="notranslate">public static void main(String[] args) {
    print(a);
    print(b);
    print(c);
}
</code></pre>
<ul>
<li>You can accomplish this challenge via any way below:
<ul>
<li>Recommended for beginners: run <code class="notranslate">git clone https://github.com/ByteLegendQuest/java-first-code-refactoring</code> to download the code,
finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
<ul>
<li>If you don't know how, you can <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/docs/en/clone-and-import.md" target="_blank">click here to see detailed docs</a>.</li>
</ul>
</li>
<li>Very unrecommended: you can <a href="https://codeload.github.com/ByteLegendQuest/java-first-code-refactoring/zip/refs/heads/main" target="_blank">click here to download zipped code</a> if you don't like <code class="notranslate">git</code> operations.</li>
<li>Or: if you are confident enough to write code in web editor directly, go ahead.</li>
<li>Or: if you are familiar with GitHub, you can fork the repo, finish the challenge and create a pull request.</li>
</ul>
</li>
<li>The bot will check your PR and tell you if you accomplish the challenge.</li>
<li>Go back to <a href="https://bytelegend.com" target="_blank">ByteLegend</a> and continue your hero journey.</li>
</ul>
<p>Good luck!</p>
<p>If you need any help, feel free to join the <a href="https://discord.gg/35RreUUGWt" target="_blank">Discord Community</a> or contact us via <a href="mailto:contact@bytelegend.com" target="_blank">contact@bytelegend.com</a>.</p>
<p><strong>Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:</strong></p>
<ul>
<li><code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li>
</ul>
</details>
<details>
<summary>Deutsch</summary>

<h1>Your First Code Refactoring</h1>
<p>Code reuse is a very important principle in software engineering. This is also called &quot;Don't Repeat Yourself&quot;, DRY.
In Java, we extract similar logic into common methods to reuse code.
In <code class="notranslate">main</code> method of <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">src/main/java/com/bytelegend/Challenge.java</a> you can see a lot of similar logic duplicated.
Please extract the common logic into <code class="notranslate">print</code> method, in order to make code easier to read and maintain
without any functionality change. This is called code refactoring.</p>
<p>After the refactoring, <code class="notranslate">main</code> method should be simplified a lot:</p>
<pre class="notranslate"><code class="notranslate">public static void main(String[] args) {
    print(a);
    print(b);
    print(c);
}
</code></pre>
<ul>
<li>You can accomplish this challenge via any way below:
<ul>
<li>Recommended for beginners: run <code class="notranslate">git clone https://github.com/ByteLegendQuest/java-first-code-refactoring</code> to download the code,
finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
<ul>
<li>If you don't know how, you can <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/docs/en/clone-and-import.md" target="_blank">click here to see detailed docs</a>.</li>
</ul>
</li>
<li>Very unrecommended: you can <a href="https://codeload.github.com/ByteLegendQuest/java-first-code-refactoring/zip/refs/heads/main" target="_blank">click here to download zipped code</a> if you don't like <code class="notranslate">git</code> operations.</li>
<li>Or: if you are confident enough to write code in web editor directly, go ahead.</li>
<li>Or: if you are familiar with GitHub, you can fork the repo, finish the challenge and create a pull request.</li>
</ul>
</li>
<li>The bot will check your PR and tell you if you accomplish the challenge.</li>
<li>Go back to <a href="https://bytelegend.com" target="_blank">ByteLegend</a> and continue your hero journey.</li>
</ul>
<p>Good luck!</p>
<p>If you need any help, feel free to join the <a href="https://discord.gg/35RreUUGWt" target="_blank">Discord Community</a> or contact us via <a href="mailto:contact@bytelegend.com" target="_blank">contact@bytelegend.com</a>.</p>
<p><strong>Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:</strong></p>
<ul>
<li><code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li>
</ul>
</details>
<details>
<summary>한국어</summary>

<h1>Your First Code Refactoring</h1>
<p>Code reuse is a very important principle in software engineering. This is also called &quot;Don't Repeat Yourself&quot;, DRY.
In Java, we extract similar logic into common methods to reuse code.
In <code class="notranslate">main</code> method of <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">src/main/java/com/bytelegend/Challenge.java</a> you can see a lot of similar logic duplicated.
Please extract the common logic into <code class="notranslate">print</code> method, in order to make code easier to read and maintain
without any functionality change. This is called code refactoring.</p>
<p>After the refactoring, <code class="notranslate">main</code> method should be simplified a lot:</p>
<pre class="notranslate"><code class="notranslate">public static void main(String[] args) {
    print(a);
    print(b);
    print(c);
}
</code></pre>
<ul>
<li>You can accomplish this challenge via any way below:
<ul>
<li>Recommended for beginners: run <code class="notranslate">git clone https://github.com/ByteLegendQuest/java-first-code-refactoring</code> to download the code,
finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
<ul>
<li>If you don't know how, you can <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/docs/en/clone-and-import.md" target="_blank">click here to see detailed docs</a>.</li>
</ul>
</li>
<li>Very unrecommended: you can <a href="https://codeload.github.com/ByteLegendQuest/java-first-code-refactoring/zip/refs/heads/main" target="_blank">click here to download zipped code</a> if you don't like <code class="notranslate">git</code> operations.</li>
<li>Or: if you are confident enough to write code in web editor directly, go ahead.</li>
<li>Or: if you are familiar with GitHub, you can fork the repo, finish the challenge and create a pull request.</li>
</ul>
</li>
<li>The bot will check your PR and tell you if you accomplish the challenge.</li>
<li>Go back to <a href="https://bytelegend.com" target="_blank">ByteLegend</a> and continue your hero journey.</li>
</ul>
<p>Good luck!</p>
<p>If you need any help, feel free to join the <a href="https://discord.gg/35RreUUGWt" target="_blank">Discord Community</a> or contact us via <a href="mailto:contact@bytelegend.com" target="_blank">contact@bytelegend.com</a>.</p>
<p><strong>Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:</strong></p>
<ul>
<li><code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li>
</ul>
</details>
<details>
<summary>Italiano</summary>

<h1>Your First Code Refactoring</h1>
<p>Code reuse is a very important principle in software engineering. This is also called &quot;Don't Repeat Yourself&quot;, DRY.
In Java, we extract similar logic into common methods to reuse code.
In <code class="notranslate">main</code> method of <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">src/main/java/com/bytelegend/Challenge.java</a> you can see a lot of similar logic duplicated.
Please extract the common logic into <code class="notranslate">print</code> method, in order to make code easier to read and maintain
without any functionality change. This is called code refactoring.</p>
<p>After the refactoring, <code class="notranslate">main</code> method should be simplified a lot:</p>
<pre class="notranslate"><code class="notranslate">public static void main(String[] args) {
    print(a);
    print(b);
    print(c);
}
</code></pre>
<ul>
<li>You can accomplish this challenge via any way below:
<ul>
<li>Recommended for beginners: run <code class="notranslate">git clone https://github.com/ByteLegendQuest/java-first-code-refactoring</code> to download the code,
finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
<ul>
<li>If you don't know how, you can <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/docs/en/clone-and-import.md" target="_blank">click here to see detailed docs</a>.</li>
</ul>
</li>
<li>Very unrecommended: you can <a href="https://codeload.github.com/ByteLegendQuest/java-first-code-refactoring/zip/refs/heads/main" target="_blank">click here to download zipped code</a> if you don't like <code class="notranslate">git</code> operations.</li>
<li>Or: if you are confident enough to write code in web editor directly, go ahead.</li>
<li>Or: if you are familiar with GitHub, you can fork the repo, finish the challenge and create a pull request.</li>
</ul>
</li>
<li>The bot will check your PR and tell you if you accomplish the challenge.</li>
<li>Go back to <a href="https://bytelegend.com" target="_blank">ByteLegend</a> and continue your hero journey.</li>
</ul>
<p>Good luck!</p>
<p>If you need any help, feel free to join the <a href="https://discord.gg/35RreUUGWt" target="_blank">Discord Community</a> or contact us via <a href="mailto:contact@bytelegend.com" target="_blank">contact@bytelegend.com</a>.</p>
<p><strong>Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:</strong></p>
<ul>
<li><code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li>
</ul>
</details>