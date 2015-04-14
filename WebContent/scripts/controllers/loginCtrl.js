define([ 'controllers/controllers' ], function(controllers) {
	controllers.controller('loginCtrl', [ '$rootScope', '$scope',
			function($rootScope, $scope) {
				$scope.homePageUrl = 'index.html';
				$scope.User = {};
				$scope.user = { account: 'superadmin', password: '123' };

			} ]);
});