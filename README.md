<details open='true' >
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

<details >
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

<details >
<summary>繁體中文</summary>

<h1>你的第一次代碼重構</h1><p>代碼重用是軟件工程中一個非常重要的原則。這也稱為“不要重複自己”，DRY。在 Java 中，我們將類似的邏輯提取到常用方法中以重用代碼。在<a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">src/main/java/com/bytelegend/Challenge.java 的</a><code class="notranslate">main</code>方法中，您可以看到很多類似的邏輯重複。請將通用邏輯提取到<code class="notranslate">print</code>方法中，以便在不進行任何功能更改的情況下使代碼更易於閱讀和維護。這稱為代碼重構。</p><p>重構之後， <code class="notranslate">main</code>方法應該簡化很多：</p><pre class="notranslate"><code class="notranslate">public static void main(String[] args) {
    print(a);
    print(b);
    print(c);
}
</code></pre><ul><li>您可以使用任何一種方式來完成挑戰（最好在本地計算機上進行測試）：<ul><li>使用下面的網絡編輯器。</li><li>創建 GitHub 拉取請求。</li></ul></li><li>機器人將檢查您的 PR 並告訴您是否完成了挑戰。</li><li>回到<a href="https://bytelegend.com" target="_blank">ByteLegend</a> ，繼續你的英雄之旅。</li></ul><p><strong>注意：我們只允許您修改以下文件。對以下文件以外的文件的任何更改都將被拒絕：</strong></p><ul><li> <code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li></ul></details>

<details >
<summary>Español</summary>

<h1>Tu primera refactorización de código</h1><p> La reutilización de código es un principio muy importante en la ingeniería de software. Esto también se llama &quot;No se repita&quot;, SECO. En Java, extraemos una lógica similar en métodos comunes para reutilizar el código. En el método <code class="notranslate">main</code> <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">de src / main / java / com / bytelegend / Challenge.java</a> puedes ver mucha lógica similar duplicada. Extraiga la lógica común en el <code class="notranslate">print</code> para que el código sea más fácil de leer y mantener sin ningún cambio de funcionalidad. A esto se le llama refactorización de código.</p><p> Después de la refactorización, el <code class="notranslate">main</code> debe simplificarse mucho:</p><pre class="notranslate"><code class="notranslate">public static void main(String[] args) {
    print(a);
    print(b);
    print(c);
}
</code></pre><ul><li>Puede usar cualquiera de las dos formas para lograr el desafío (será mejor que lo pruebe en su computadora local):<ul><li> Utilice el editor web a continuación.</li><li> Cree una solicitud de extracción de GitHub.</li></ul></li><li> El bot comprobará tus relaciones públicas y te dirá si logras el desafío.</li><li> Vuelve a <a href="https://bytelegend.com" target="_blank">ByteLegend</a> y continúa tu viaje de héroe.</li></ul><p> <strong>Nota: solo le permitimos modificar los siguientes archivos. Se rechazará cualquier cambio en archivos que no sean los siguientes:</strong></p><ul><li> <code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li></ul></details>

<details >
<summary>العربية</summary>

<h1 style=";text-align:right;direction:rtl">أول إعادة بيع ديون كود الخاص بك</h1><p style=";text-align:right;direction:rtl"> إعادة استخدام الكود هو مبدأ مهم للغاية في هندسة البرمجيات. يسمى هذا أيضًا &quot;لا تكرر نفسك&quot; ، جاف. في Java ، نستخرج منطقًا مشابهًا إلى طرق شائعة لإعادة استخدام الكود. في الطريقة <code class="notranslate">main</code> <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">لـ src / main / java / com / bytelegend / Challenge.java ،</a> يمكنك رؤية الكثير من المنطق المماثل المكرر. يرجى استخراج المنطق المشترك في <code class="notranslate">print</code> ، من أجل تسهيل قراءة التعليمات البرمجية والحفاظ عليها دون أي تغيير في الوظيفة. وهذا ما يسمى بإعادة بناء الكود.</p><p style=";text-align:right;direction:rtl"> بعد إعادة الهيكلة ، يجب تبسيط الطريقة <code class="notranslate">main</code></p><pre class="notranslate" style=";text-align:right;direction:rtl"> <code class="notranslate">public static void main(String[] args) {
    print(a);
    print(b);
    print(c);
}
</code></pre><ul style=";text-align:right;direction:rtl"><li style=";text-align:right;direction:rtl">يمكنك استخدام أي من الطريقتين لإنجاز التحدي (من الأفضل اختباره على جهاز الكمبيوتر المحلي الخاص بك):<ul style=";text-align:right;direction:rtl"><li style=";text-align:right;direction:rtl"> استخدم محرر الويب أدناه.</li><li style=";text-align:right;direction:rtl"> إنشاء طلب سحب على GitHub.</li></ul></li><li style=";text-align:right;direction:rtl"> سيتحقق الروبوت من العلاقات العامة الخاصة بك ويخبرك إذا أنجزت التحدي.</li><li style=";text-align:right;direction:rtl"> ارجع إلى <a href="https://bytelegend.com" target="_blank">ByteLegend وتابع</a> رحلة بطلك.</li></ul><p style=";text-align:right;direction:rtl"> <strong>ملاحظة: نسمح لك فقط بتعديل الملفات التالية. سيتم رفض أي تغييرات يتم إجراؤها على الملفات بخلاف الملفات التالية:</strong></p><ul style=";text-align:right;direction:rtl"><li style=";text-align:right;direction:rtl"> <code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li></ul></details>

<details >
<summary>Português</summary>

<h1>Sua primeira refatoração de código</h1><p> A reutilização de código é um princípio muito importante na engenharia de software. Isso também é chamado de &quot;Don&#39;t Repeat Yourself&quot;, DRY. Em Java, extraímos lógica semelhante em métodos comuns para reutilizar código. No método <code class="notranslate">main</code> <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">de src / main / java / com / bytelegend / Challenge.java</a> você pode ver muitas lógicas semelhantes duplicadas. Extraia a lógica comum no <code class="notranslate">print</code> , a fim de tornar o código mais fácil de ler e manter sem qualquer alteração de funcionalidade. Isso é chamado de refatoração de código.</p><p> Após a refatoração, o <code class="notranslate">main</code> deve ser bastante simplificado:</p><pre class="notranslate"><code class="notranslate">public static void main(String[] args) {
    print(a);
    print(b);
    print(c);
}
</code></pre><ul><li>Você pode usar qualquer uma das formas para cumprir o desafio (é melhor você testá-lo em seu computador local):<ul><li> Use o editor da web abaixo.</li><li> Crie uma solicitação pull do GitHub.</li></ul></li><li> O bot verificará seu PR e lhe dirá se você cumpriu o desafio.</li><li> Volte para <a href="https://bytelegend.com" target="_blank">ByteLegend</a> e continue sua jornada de herói.</li></ul><p> <strong>Nota: nós apenas permitimos que você modifique os seguintes arquivos. Quaisquer alterações em arquivos que não sejam os seguintes serão rejeitadas:</strong></p><ul><li> <code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li></ul></details>

<details >
<summary>Bahasa Indonesia</summary>

<h1>Pemfaktoran Ulang Kode Pertama Anda</h1><p> Penggunaan kembali kode adalah prinsip yang sangat penting dalam rekayasa perangkat lunak. Ini juga disebut &quot;Jangan Ulangi Sendiri&quot;, KERING. Di Java, kami mengekstrak logika serupa ke dalam metode umum untuk menggunakan kembali kode. Dalam metode <code class="notranslate">main</code> <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">src/main/Java/com/bytelegend/Challenge.java</a> Anda dapat melihat banyak logika serupa yang diduplikasi. Harap ekstrak logika umum ke dalam <code class="notranslate">print</code> , untuk membuat kode lebih mudah dibaca dan dipelihara tanpa perubahan fungsi apa pun. Ini disebut pemfaktoran ulang kode.</p><p> Setelah refactoring, <code class="notranslate">main</code> harus banyak disederhanakan:</p><pre class="notranslate"><code class="notranslate">public static void main(String[] args) {
    print(a);
    print(b);
    print(c);
}
</code></pre><ul><li>Anda dapat menggunakan salah satu cara untuk menyelesaikan tantangan (sebaiknya Anda mengujinya di komputer lokal Anda):<ul><li> Gunakan editor web di bawah ini.</li><li> Buat Permintaan Tarik GitHub.</li></ul></li><li> Bot akan memeriksa PR Anda dan memberi tahu Anda jika Anda menyelesaikan tantangan.</li><li> Kembali ke <a href="https://bytelegend.com" target="_blank">ByteLegend</a> dan lanjutkan perjalanan pahlawan Anda.</li></ul><p> <strong>Catatan: kami hanya mengizinkan Anda untuk mengubah file berikut. Setiap perubahan pada file selain file berikut akan ditolak:</strong></p><ul><li> <code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li></ul></details>

<details >
<summary>Français</summary>

<h1>Votre première refactorisation de code</h1><p> La réutilisation du code est un principe très important en génie logiciel. Ceci est également appelé &quot;Ne vous répétez pas&quot;, SEC. En Java, nous extrayons une logique similaire dans des méthodes courantes pour réutiliser le code. Dans <code class="notranslate">main</code> méthode <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">principale de src/main/java/com/bytelegend/Challenge.java,</a> vous pouvez voir de nombreuses logiques similaires dupliquées. Veuillez extraire la logique commune dans <code class="notranslate">print</code> méthode d&#39;impression, afin de rendre le code plus facile à lire et à maintenir sans aucun changement de fonctionnalité. C&#39;est ce qu&#39;on appelle la refactorisation de code.</p><p> Après la refactorisation, <code class="notranslate">main</code> méthode principale devrait être beaucoup simplifiée :</p><pre class="notranslate"><code class="notranslate">public static void main(String[] args) {
    print(a);
    print(b);
    print(c);
}
</code></pre><ul><li>Vous pouvez utiliser l&#39;une ou l&#39;autre manière pour relever le défi (vous feriez mieux de le tester sur votre ordinateur local) :<ul><li> Utilisez l&#39;éditeur Web ci-dessous.</li><li> Créez une demande d&#39;extraction GitHub.</li></ul></li><li> Le bot vérifiera votre PR et vous dira si vous réussissez le défi.</li><li> Retournez à <a href="https://bytelegend.com" target="_blank">ByteLegend</a> et continuez votre voyage de héros.</li></ul><p> <strong>Remarque : nous vous permettons uniquement de modifier les fichiers suivants. Toute modification apportée aux fichiers autres que les fichiers suivants sera rejetée :</strong></p><ul><li> <code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li></ul></details>

<details >
<summary>日本語</summary>

<h1>最初のコードリファクタリング</h1><p>コードの再利用は、ソフトウェアエンジニアリングにおいて非常に重要な原則です。これは「Don&#39;tRepeatYourself」、DRYとも呼ばれます。 Javaでは、同様のロジックを一般的なメソッドに抽出して、コードを再利用します。 <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">src / main / java / com / bytelegend / Challenge.javaの</a><code class="notranslate">main</code>メソッドでは、多くの同様のロジックが複製されているのを見ることができます。機能を変更せずにコードを読みやすく、保守しやすくするために、共通のロジックを<code class="notranslate">print</code>これはコードリファクタリングと呼ばれます。</p><p>リファクタリング後、 <code class="notranslate">main</code>メソッドは大幅に簡略化する必要があります。</p><pre class="notranslate"><code class="notranslate">public static void main(String[] args) {
    print(a);
    print(b);
    print(c);
}
</code></pre><ul><li>どちらの方法でもチャレンジを達成できます（ローカルコンピューターでテストすることをお勧めします）。<ul><li>以下のWebエディタを使用してください。</li><li> GitHubプルリクエストを作成します。</li></ul></li><li>ボットはPRをチェックし、チャレンジを達成したかどうかを通知します。</li><li> <a href="https://bytelegend.com" target="_blank">ByteLegendに</a>戻り、ヒーローの旅を続けてください。</li></ul><p><strong>注：変更できるのは次のファイルのみです。次のファイル以外のファイルへの変更は拒否されます。</strong></p><ul><li> <code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li></ul></details>

<details >
<summary>Русский</summary>

<h1>Ваш первый рефакторинг кода</h1><p> Повторное использование кода - очень важный принцип в разработке программного обеспечения. Это также называется «Не повторяйся», СУХОЙ. В Java мы извлекаем аналогичную логику в общие методы для повторного использования кода. В <code class="notranslate">main</code> методе <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">src / main / java / com / bytelegend / Challenge.java</a> вы можете увидеть много дублированной похожей логики. Извлеките общую логику в <code class="notranslate">print</code> , чтобы упростить чтение и поддержку кода без изменения функциональности. Это называется рефакторингом кода.</p><p> После рефакторинга следует сильно упростить метод <code class="notranslate">main</code></p><pre class="notranslate"><code class="notranslate">public static void main(String[] args) {
    print(a);
    print(b);
    print(c);
}
</code></pre><ul><li>Вы можете использовать любой способ решения задачи (лучше протестируйте его на своем локальном компьютере):<ul><li> Воспользуйтесь веб-редактором ниже.</li><li> Создайте запрос на извлечение GitHub.</li></ul></li><li> Бот проверит ваш PR и скажет, справитесь ли вы с задачей.</li><li> Вернитесь в <a href="https://bytelegend.com" target="_blank">ByteLegend</a> и продолжите свой путь героя.</li></ul><p> <strong>Примечание: мы разрешаем вам изменять только следующие файлы. Любые изменения в файлах, кроме следующих, будут отклонены:</strong></p><ul><li> <code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li></ul></details>

<details >
<summary>Deutsch</summary>

<h1>Ihr erstes Code-Refactoring</h1><p> Die Wiederverwendung von Code ist ein sehr wichtiges Prinzip in der Softwareentwicklung. Dies wird auch &quot;Don&#39;t Repeat Yourself&quot; genannt, DRY. In Java extrahieren wir ähnliche Logik in gängige Methoden, um Code wiederzuverwenden. Im <code class="notranslate">main</code> von <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">src / main / java / com / bytelegend / Challenge.java</a> können Sie eine Menge ähnlicher Logik sehen dupliziert. Bitte extrahieren Sie die allgemeine Logik in die <code class="notranslate">print</code> , damit der Code ohne Funktionsänderungen leichter zu lesen und zu warten ist. Dies wird als Code-Refactoring bezeichnet.</p><p> Nach dem Refactoring, <code class="notranslate">main</code> sollte Methode viel vereinfacht werden:</p><pre class="notranslate"><code class="notranslate">public static void main(String[] args) {
    print(a);
    print(b);
    print(c);
}
</code></pre><ul><li>Sie können die Herausforderung auf beide Arten meistern (am besten testen Sie sie auf Ihrem lokalen Computer):<ul><li> Verwenden Sie den untenstehenden Web-Editor.</li><li> Erstellen Sie eine GitHub-Pull-Anfrage.</li></ul></li><li> Der Bot überprüft Ihre PR und teilt Ihnen mit, ob Sie die Herausforderung meistern.</li><li> Gehen Sie zurück zu <a href="https://bytelegend.com" target="_blank">ByteLegend</a> und setzen Sie Ihre Heldenreise fort.</li></ul><p> <strong>Hinweis: Wir erlauben Ihnen nur, die folgenden Dateien zu ändern. Alle Änderungen an Dateien, die nicht die folgenden Dateien sind, werden abgelehnt:</strong></p><ul><li> <code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li></ul></details>

<details >
<summary>한국어</summary>

<h1>첫 번째 코드 리팩토링</h1><p> 코드 재사용은 소프트웨어 엔지니어링에서 매우 중요한 원칙입니다. 이것은 &quot;반복하지마&quot;, DRY라고도 합니다. Java에서는 코드를 재사용하기 위해 유사한 논리를 공통 메서드로 추출합니다. <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">src/main/java/com/bytelegend/Challenge.java</a> 의 <code class="notranslate">main</code> 메소드에서 유사한 로직이 많이 복제된 것을 볼 수 있습니다. 기능 변경 없이 코드를 더 쉽게 읽고 유지 관리할 수 있도록 공통 논리를 <code class="notranslate">print</code> 이것을 코드 리팩토링이라고 합니다.</p><p> 리팩토링 후, <code class="notranslate">main</code> 메소드는 많이 단순화되어야 합니다:</p><pre class="notranslate"><code class="notranslate">public static void main(String[] args) {
    print(a);
    print(b);
    print(c);
}
</code></pre><ul><li>두 가지 방법 중 하나를 사용하여 도전 과제를 수행할 수 있습니다(로컬 컴퓨터에서 테스트하는 것이 좋습니다).<ul><li> 아래 웹 편집기를 사용하십시오.</li><li> GitHub 풀 요청을 만듭니다.</li></ul></li><li> 봇은 PR을 확인하고 도전 과제를 달성했는지 알려줍니다.</li><li> <a href="https://bytelegend.com" target="_blank">ByteLegend로</a> 돌아가 영웅 여정을 계속하세요.</li></ul><p> <strong>참고: 다음 파일만 수정할 수 있습니다. 다음 파일 이외의 파일에 대한 모든 변경 사항은 거부됩니다.</strong></p><ul><li> <code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li></ul></details>

<details >
<summary>Italiano</summary>

<h1>Il tuo primo refactoring del codice</h1><p> Il riutilizzo del codice è un principio molto importante nell&#39;ingegneria del software. Questo è anche chiamato &quot;Non ripetere te stesso&quot;, ASCIUTTO. In Java, estraiamo una logica simile in metodi comuni per riutilizzare il codice. Nel metodo <code class="notranslate">main</code> <a href="https://github.com/ByteLegendQuest/java-first-code-refactoring/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">di src/main/java/com/bytelegend/Challenge.java</a> puoi vedere molte logiche simili duplicate. Estrarre la logica comune nel <code class="notranslate">print</code> , al fine di rendere il codice più facile da leggere e mantenere senza alcuna modifica di funzionalità. Questo è chiamato refactoring del codice.</p><p> Dopo il refactoring, il <code class="notranslate">main</code> dovrebbe essere molto semplificato:</p><pre class="notranslate"><code class="notranslate">public static void main(String[] args) {
    print(a);
    print(b);
    print(c);
}
</code></pre><ul><li>Puoi utilizzare entrambi i modi per completare la sfida (farai meglio a testarlo sul tuo computer locale):<ul><li> Usa l&#39;editor web qui sotto.</li><li> Crea una richiesta pull GitHub.</li></ul></li><li> Il bot controllerà il tuo PR e ti dirà se hai portato a termine la sfida.</li><li> Torna su <a href="https://bytelegend.com" target="_blank">ByteLegend</a> e continua il tuo viaggio da eroe.</li></ul><p> <strong>Nota: ti permettiamo di modificare solo i seguenti file. Qualsiasi modifica ai file diversi dai seguenti file verrà rifiutata:</strong></p><ul><li> <code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li></ul></details>
