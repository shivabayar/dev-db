google.load("visualization", "1", {packages:["corechart"]});
      google.setOnLoadCallback(drawChart);
      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['Month', 'Pull Requests'],
          ['Jan',  10],
          ['Feb',  11],
          ['March',  6],
          ['April',  1],
          ['May',  15],
          ['June',  16],
          ['July',  19],
          ['Aug',  10],
          ['Sept',  0],
          ['Oct',  65],
          ['Nov',  10],
          ['Dec',  11]

        ]);

        var options = {
          title: 'Pull Requests per month',
          vAxis: {title: 'Year',  titleTextStyle: {color: 'red'}}
        };

        var chart = new google.visualization.BarChart(document.getElementById('pull_request'));
        chart.draw(data, options);
      }