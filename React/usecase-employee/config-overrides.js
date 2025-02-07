const webpack = require("webpack");

module.exports = function override(config) {
  config.resolve.fallback = {
    http: require.resolve("stream-http"),
    https: require.resolve("https-browserify"),
    zlib: require.resolve("browserify-zlib"),
    stream: require.resolve("stream-browserify"),
    url: require.resolve("url/"),
    process: require.resolve("process/browser"),
  };

  config.plugins.push(
    new webpack.ProvidePlugin({
      process: "process/browser",
    })
  );

  return config;
};
