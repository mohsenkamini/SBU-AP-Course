git init
git config --global user.name "dana"
git config --global user.email "dana@gmail.com"
git add -A 
git reset HEAD -- temp
git commit -m 'initiall commit'
git commit --amend -m "initial commit"
git status -s
git mv js/a.js js/myfile.js
git commit -m "rename js file"
git add js/myfile.js
git commit -m "change js file"
git log --oneline 
git reset --hard 07a0ce0
git remote add origin https://github.com/someusername/the-project
git branch develop
git branch
git checkout develop
git checkout master
git merge develop
git branch -d develop
git push -u origin master