 google.load("visualization", "1", {packages:["corechart"]});
      google.setOnLoadCallback(drawChart);
      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['Month', 'Commits'],
          ['Jan',  1000],
          ['Feb',  1170],
          ['March',  660],
          ['April',  1030],
          ['May',  1030],
          ['June',  1030],
          ['July',  1030],
          ['Aug',  1030],
          ['Sept',  1030],
          ['Oct',  1030],
          ['Nov',  1030],
          ['Dec',  1030]
        ]);

        var options = {
          title: 'Your Commit trend'
        };

        var chart = new google.visualization.LineChart(document.getElementById('commit_trend'));
        chart.draw(data, options);
      }