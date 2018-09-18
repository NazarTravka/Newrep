const path= require("path");

module.exports={
entry:'./src/index.js',
output:{
	path: path.resolve(__dirname, './dist'),
	filename:'main.js',
	publicPath:'dist/'
},
module:{
	 rules: [
  
   {
      test: /\.less$/,
      exclude: /node_modules/,
      use: [
         'style-loader',
         'css-loader',
         'less-loader'
    ]
    }

  ]
},
devtool:'eval-sourcemap'
}


