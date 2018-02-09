$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/Features/TC01.feature");
formatter.feature({
  "line": 1,
  "name": "Validate Different tabs navigation",
  "description": "",
  "id": "validate-different-tabs-navigation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13093400366,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Validdate Different tabs navigation",
  "description": "",
  "id": "validate-different-tabs-navigation;validdate-different-tabs-navigation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on sample forms tab",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "sample forms page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "mycontactformsteps.the_user_is_on_home_tab()"
});
formatter.result({
  "duration": 663109428,
  "status": "passed"
});
formatter.match({
  "location": "mycontactformsteps.go_to_sample_forms_tab()"
});
formatter.result({
  "duration": 7321583279,
  "status": "passed"
});
formatter.match({
  "location": "mycontactformsteps.validate_sampleforms_tab()"
});
formatter.result({
  "duration": 91245476,
  "status": "passed"
});
formatter.after({
  "duration": 685215506,
  "status": "passed"
});
