# :large_blue_diamond: Almost increasing sequence challenge:

## Challenge description
<div class="markdown -arial"><p>Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.</p>
<p><em>Note:</em> sequence <code>a<sub>0</sub></code>, <code>a<sub>1</sub></code>, ..., <code>a<sub>n</sub></code> is considered to be a strictly increasing if <code>a<sub>0</sub> &lt; a<sub>1</sub> &lt; ... &lt; a<sub>n</sub></code>. Sequence containing only one element is also considered to be strictly increasing.</p>
<p><span class="markdown--header" style="color:#2b3b52;font-size:1.4em">Example</span></p>
<ul>
<li>
<p>For <code>sequence = [1, 3, 2, 1]</code>, the output should be<br>
<code>solution(sequence) = false</code>.</p>
<p>There is no one element in this array that can be removed in order to get a strictly increasing sequence.</p>
</li>
<li>
<p>For <code>sequence = [1, 3, 2]</code>, the output should be<br>
<code>solution(sequence) = true</code>.</p>
<p>You can remove <code>3</code> from the array to get the strictly increasing sequence <code>[1, 2]</code>. Alternately, you can remove <code>2</code> to get the strictly increasing sequence <code>[1, 3]</code>.</p>
</li>
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
<p><strong>[input] array.integer sequence</strong></p>
<p><em>Guaranteed constraints:</em><br>
<code>2 ≤ sequence.length ≤ 10<sup>5</sup></code>,<br>
<code>-10<sup>5</sup> ≤ sequence[i] ≤ 10<sup>5</sup></code>.</p>
</li>
<li>
<p><strong>[output] boolean</strong></p>
<p>Return <code>true</code> if it is possible to remove one element from the array in order to get a strictly increasing sequence, otherwise return <code>false</code>.</p>
</li>
</ul>
</div>
## Solutions:

- [JS solution](Almost_increasing_sequence.js)
https://github.com/Brnd08/CodeSignalSolutions/blob/b17982015cc32bea57323a333ba7b8bbe04d2ba7/Almost_Increasing_Sequence/Almost_increasing_sequence.js#L1-L25
![JS Execution](almost_increasing_sequence_js.png)


- [Java solution](Almost_increasing_sequence.java)
https://github.com/Brnd08/CodeSignalSolutions/blob/b17982015cc32bea57323a333ba7b8bbe04d2ba7/Almost_Increasing_Sequence/Almost_increasing_sequence.java#L13-L43
![Java Execution](almost_increasing_sequence_java.png)
