# :large_blue_diamond: Reverse In Parenthesis :large_blue_diamond:

## Challenge description
<div class="markdown -arial"><p>Write a function that reverses characters in (possibly nested) parentheses in the input string.</p>
<p>Input strings will always be well-formed with matching <code>()</code>s.</p>
<p><span class="markdown--header" style="color:#2b3b52;font-size:1.4em">Example</span></p>
<ul>
<li>For <code>inputString = "(bar)"</code>, the output should be<br>
<code>solution(inputString) = "rab"</code>;</li>
<li>For <code>inputString = "foo(bar)baz"</code>, the output should be<br>
<code>solution(inputString) = "foorabbaz"</code>;</li>
<li>For <code>inputString = "foo(bar)baz(blim)"</code>, the output should be<br>
<code>solution(inputString) = "foorabbazmilb"</code>;</li>
<li>For <code>inputString = "foo(bar(baz))blim"</code>, the output should be<br>
<code>solution(inputString) = "foobazrabblim"</code>.<br>
Because <code>"foo(bar(baz))blim"</code> becomes <code>"foo(barzab)blim"</code> and then <code>"foobazrabblim"</code>.</li>
</ul>
<p><span class="markdown--header" style="color:#2b3b52;font-size:1.4em">Input/Output</span></p>
<ul>
<li>
<p><strong>[execution time limit] 3 seconds (java)</strong></p>
</li>
<li>
<p><strong>[memory limit] 1 GB</strong></p>
</li>
<li>
<p><strong>[input] string inputString</strong></p>
<p>A string consisting of lowercase English letters and the characters <code>(</code> and <code>)</code>. It is guaranteed that all parentheses in <code>inputString</code> form a <a href="keyword://regular-bracket-sequence" target="_blank">regular bracket sequence</a>.</p>
<p><em>Guaranteed constraints:</em><br>
<code>0 ≤ inputString.length ≤ 50</code>.</p>
</li>
<li>
<p><strong>[output] string</strong></p>
<p>Return <code>inputString</code>, with all the characters that were in parentheses reversed.</p>
</li>
</ul>
<p><strong>[Java] Syntax Tips</strong></p>
</div>
## Solutions:

- [JS solution](Reverse_in_parenthesis.js)
https://github.com/Brnd08/CodeSignalSolutions/blob/21bf7587b14f6a2122125f48b111deff6ebdf464/Reverse_In_Parenthesis/Reverse_in_parenthesis.js#L1-L11
![JS Execution](reverse_in_parenthesis_js.png)


- [Java solution](Reverse_in_parenthesis.java)
https://github.com/Brnd08/CodeSignalSolutions/blob/21bf7587b14f6a2122125f48b111deff6ebdf464/Reverse_In_Parenthesis/Reverse_in_parenthesis.java#L15-L23
![Java Execution](reverse_in_parenthesis_java.png)
