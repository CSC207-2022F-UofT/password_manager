# Github Feature Development Work Flow

A Suggested Development Workflow
If you've had trouble getting a workflow going or you've been struggling to effectively contribute code to your project, please read.
Development Workflow:
<ol>
<li>Choose a feature to work on.</li>
<ul>
<li>It should be relatively small and specific. For example, “Add a function to the password manager to generate a new password” or “improve the password strength checking algorithm”</li>
<li>You should assign the GitHub issue to yourself when you start working on it if it isn’t already. If no issue exists, make it and assign it to yourself. Same applies if using another manager (e.g., Trello). This prevents someone else from working on the same thing.</li>
</ul>
<li>Pull the current main, and then check out a new branch for this feature. Name the branch a shorter version of the issue name. For example, “feature/upload_file_to_note” or “bugfix/save_likes_across_runs”. 
<li>Write a unit test for the feature. If it is a new feature, just test the basic functionality. If it is a bugfix, write a test that illustrates the problem (e.g., it fails with the current implementation).
<li>Implement the feature.
<ul>
<li>If it is a new class or function, write the function header and Javadoc comment FIRST. This will help you make sure you understand the exact input and output types that are expected. Make sure this matches your test case. If it is a bugfix, update the Javadoc if necessary (or add it if it is missing).</li>
<li>For each step in your implementation, create a commit. The commit message should be small and specific - for example, “Add generic template function for uploading files” and “Implement Word Document upload.” If the feature requires making a couple changes (for example, changing more than one/two files, or adding multiple functions), add them in separate commits. If you are tempted to put “and” or semicolons in your commit message, that should be two commits.</li>
</ul>
<li>Run the test(s) you wrote before! Likely this won’t work the first time - debug as necessary. Add test cases for edge examples (someone tries to like a post twice, or the path to the file upload doesn’t exist) and make sure those pass too. Run all the tests to make sure you didn’t break anything.</li>
<li>Run the whole program and test your new functionality through the app. Debug as necessary. </li>
<li>Push your branch to the remote repository on GitHub and create a pull request. Explain what you did in a comment, and if you have any questions about your implementation. Request reviews from your teammates.</li>
<ul>
<li>Hopefully, because you pulled the most recent changes before you started, there won’t be any merge conflicts. If a couple days have passed during your development, you may need to resolve conflicts between your work and someone else’s. </li>
<li>If your teammates suggest changes, you can add the recommended changes in new commits to the same branch. Once everyone is happy, you or a teammate can merge the pull request and delete the branch (locally on your computer and remotely on GitHub).</li>
<li>At the end of this process, your local repository should be clean (no uncommitted changes). Make sure you are back on the main branch and that you clean up any temporary files, changes you made that you decided not to commit, etc., so that you are ready to tackle the next feature!</li>
</ul>
</ol>
Note: I know this seems like a lot of steps for implementing one feature. In coding, I find it very helpful to set aside a relatively large chunk of time (at least an hour, preferably two or more for a larger task) and try to complete this whole process from start to finish. Not only does this help prevent merge conflicts, but also is much more efficient than stopping and starting a bunch of times and having to remember where you were and what you were trying to do. Therefore, it is important to break big tasks into smaller chunks and do them one at a time (which is much easier when your code follows SRP and Clean Architecture!).


