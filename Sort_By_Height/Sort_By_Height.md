# :large_blue_diamond: Sort by Height :large_blue_diamond:

## Challenge description
<div class="markdown -arial"><p>Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange the people by their heights in a non-descending order without moving the trees. People can be very tall!</p>
<p><span class="markdown--header" style="color:#2b3b52;font-size:1.4em">Example</span></p>
<p>For <code>a = [-1, 150, 190, 170, -1, -1, 160, 180]</code>, the output should be<br>
<code>solution(a) = [-1, 150, 160, 170, -1, -1, 180, 190]</code>.</p>
<p><span class="markdown--header" style="color:#2b3b52;font-size:1.4em">Input/Output</span></p>
<ul>
<li>
<p><strong>[execution time limit] 3 seconds (java)</strong></p>
</li>
<li>
<p><strong>[memory limit] 1 GB</strong></p>
</li>
<li>
<p><strong>[input] array.integer a</strong></p>
<p>If <code>a[i] = -1</code>, then the <code>i<sup>th</sup></code> position is occupied by a tree. Otherwise <code>a[i]</code> is the height of a person standing in the <code>i<sup>th</sup></code> position.</p>
<p><em>Guaranteed constraints:</em><br>
<code>1 ≤ a.length ≤ 1000</code>,<br>
<code>-1 ≤ a[i] ≤ 1000</code>.</p>
</li>
<li>
<p><strong>[output] array.integer</strong></p>
<p>Sorted array <code>a</code> with all the trees untouched.</p>
</li>
</ul>
<p><strong>[Java] Syntax Tips</strong></p>
</div>
## Solutions:

- [JS solution](Sort_by_height.js)
https://github.com/Brnd08/CodeSignalSolutions/blob/bfe6e996ae8cb72d84e6e0c7e60a8540bfd84713/Sort_By_Height/Sort_by_height.js#L1-L23
![JS Execution](sort_by_height_js.png)


- [Java solution](Sort_by_height.java)
https://github.com/Brnd08/CodeSignalSolutions/blob/bfe6e996ae8cb72d84e6e0c7e60a8540bfd84713/Sort_By_Height/Sort_by_height.java#L16-L38
![Java Execution](sort_by_height_java.png)
