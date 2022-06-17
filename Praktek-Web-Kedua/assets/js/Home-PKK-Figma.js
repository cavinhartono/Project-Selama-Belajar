const list = document.querySelectorAll(".list");

function listActive() {
  list.forEach((item) => item.classList.add("aktif"));
  this.classList.remove("aktif");
}

list.forEach((item) => item.addEventListener("click", listActive));
