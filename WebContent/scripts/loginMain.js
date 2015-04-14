require.config({
	paths : {
		/*
		 * 引入类库
		 */
		// jquery
		jquery : 'http://cdn.bootcss.com/jquery/1.9.1/jquery.min',
		// Angular
		angular : 'http://cdn.bootcss.com/angular.js/1.4.0-beta.6/angular.min',
		// domReady
		domReady : 'vendor/domReady'
	},
	shim : {
		/*
		 * 对引入的类库，表明依赖关系，并暴露名称 需要把此处的名字，在app.js文件中define写上才能使用
		 */
		angular : {
			deps : [ 'jquery' ],
			exports : 'angular'
		}
	}
});
require(
		[ 'angular', 'loginApp', 'domReady', 'controllers/loginCtrl' ],
		function(angular, loginApp, domReady) {
			// $("#div1").html("abc");
			loginApp
					.config(function($httpProvider) {
						$httpProvider.defaults.withCredentials = true;
						$httpProvider.defaults.useXDomain = true;
						delete $httpProvider.defaults.headers.common['X-Requested-With'];
					});

			domReady(function() {
				angular.bootstrap(document, [ 'eOrderingApp' ]);

				$('html').addClass('ng-app: eOrderingApp');
			});
		})