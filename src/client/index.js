const { request, gql } = require('graphql-request')

const req = `
  query GetRecentTeams {
    recentTeams(count: 1, offset:0) {
      name
      color
      city
      id
    }
}`

request('http://localhost:8080/graphql', req)
    .then(
        (data) => {
            req.recentTeams.forEach(element => {
                console.log(`Team number ${element.id} is ${element.name} ${element.city} which is of color ${color}`);
            });
        }
    )
