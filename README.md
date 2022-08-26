# ApiProjectWork ( git )

1. git init
2. git add -A
3. git commit -m "Added new project"
4. git remote add origin https://github.com/gorazdmurko/ApiProjectWork.git
5. git branch --> ( just to checkout current branch - which is master )
6. git push -u -f origin master --> creates remote master branch and pushes to it

# COMMIT & PUSH
-- When changes are made (for example in README.md) and you want to commit & push --

1. git add README.md
2. git commit -m 'some message'
3. git push origin master --> (if master is name of the branch you want to push to)

-- ommit 'git add' command if lots of changes made --

1. git commit -a -m 'some message'
2. git push origin master --> (if master is name of the branch you want to push to)
 
# PULL
- git pull

# LOCAL BRANCHES
1. git branch ~~ returns an info of current local branch
2. git checkout develop ~~ switches to develop local branch (if already exists)
3. git checkout -b develop ~~ creates local develop branch and switches to it
4. git checkout -b praksa develop ~~ creates new branch from your current branch
5. git push -u origin 'branch-name' ~~ pushing a current local branch to newly created remote branch (-u is the shortcut for --set-upstream)

# REMOTE BRANCHES
- git fetch --all
# STEPS TO CREATE REMOTE BRANCH
1. create a local branch first and switch to it --> git checkout -b 'new-branch-name'
2. only if you want to create new branch from existing one --> git checkout -b 'new-branch-name' 'from-branch-name'
3. pushing a local branch to remote --> git push -u origin 'branch-name'
- step 3 --> sets default remote branch to the current local branch -- it also creates remote branch if it does not exist yet

# MERGE
-- merge from develop to master --

1. git branch
2. git checkout master
3. git merge develop

# CLONE
1. git clone --branch master https://github.com/gorazdmurko/Hybris-Sap-Commerce-Training.git custom --> clone from specific branch to specific folder

# DELETE BRANCHES
1. git branch -d 'branch_name' ~~ delete local branch
2. git branch -D 'branch_name' ~~ delete local branch
3. git push 'remote_name' --delete 'branch_name' ~~ delete REMOTE branch

# DELETE REMOTE & SET IT AGAIN
1. git remote remove origin
2. git remote add origin [https://youroriginurl.git]

# USEFUL INFO
- git status --> See changes
- git branch -v --> To see the last commit on each branch, you can run
- git branch --merged --> To see which branches are already merged into the branch you’re on, you can run
- git branch --no-merged --> To see all the branches that contain work you haven’t yet merged in, you can run

# REFERENCES
- https://www.digitalocean.com/community/tutorials/how-to-push-an-existing-project-to-github
- https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/How-to-push-an-existing-project-to-GitHub
- https://www.git-tower.com/learn/git/commands/git-commit
- https://www.atlassian.com/git/tutorials/syncing/git-pull
- https://www.atlassian.com/git/tutorials/using-branches/git-checkout
- https://www.w3docs.com/snippets/git/how-to-create-a-remote-branch-in-git.html
