define([ 'controllers/controllers' ], function(controllers) {
	controllers.controller('loginCtrl', [ '$rootScope', '$http', '$scope',
			function($rootScope, $http, $scope) {
				$scope.homePageUrl = 'index.html';
				$scope.User = {};
				$scope.user = {
					account : 'superadmin',
					password : '123'
				};
				$scope.test = function() {
					$http.post("/test1").success(function(data) {
						alert(data);
					});
				};

			} ]);
});