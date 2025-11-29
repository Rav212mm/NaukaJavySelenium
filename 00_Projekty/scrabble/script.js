const boardSize = 9;
const gameBoard = document.getElementById('game-board');
const letterRack = document.getElementById('letter-rack');

// Tworzenie planszy
for (let i = 0; i < boardSize * boardSize; i++) {
    const tile = document.createElement('div');
    tile.classList.add('tile');
    tile.dataset.index = i;
    gameBoard.appendChild(tile);
}

// Litery gracza
const letters = ['A', 'E', 'I', 'O', 'U', 'L', 'N'];
letters.forEach(letter => {
    const letterDiv = document.createElement('div');
    letterDiv.classList.add('letter');
    letterDiv.textContent = letter;
    letterDiv.draggable = true;
    letterRack.appendChild(letterDiv);
});

// Obsługa przeciągania i upuszczania
let draggedLetter = null;

document.addEventListener('dragstart', function(e) {
    if (e.target.classList.contains('letter')) {
        draggedLetter = e.target;
    }
});

document.addEventListener('dragover', function(e) {
    if (e.target.classList.contains('tile')) {
        e.preventDefault();
    }
});

document.addEventListener('drop', function(e) {
    if (e.target.classList.contains('tile') && draggedLetter) {
        e.target.textContent = draggedLetter.textContent;
        draggedLetter.parentNode.removeChild(draggedLetter);
        draggedLetter = null;
    }
});
