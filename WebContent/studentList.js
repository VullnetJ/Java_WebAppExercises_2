

function studentFunction() {
  var table = document.getElementById("table").innerHTML;
  var row = table.insertRow(0);
  var cell1 = row.insertCell(0);
  var cell2 = row.insertCell(1);
  var cell2 = row.insertCell(2);
  var cell2 = row.insertCell(3);

  cell1.innerHTML = "Id";
  cell2.innerHTML = "First name";
  cell1.innerHTML = "Last name";
  cell1.innerHTML = "Street";
  cell1.innerHTML = "Post code";
  cell1.innerHTML = "Post office";
  
}