/**
 *  PROXY PATTERN
 *  -> Is a structural design pattern that lets you provide a substitute or place holder for another object.
 *  A proxy controls access to the original object, allowing you to perform something either before or after
 *  the request gets through to the original object.
 *  -> Lazy initialization (virtual proxy). This is when you have a heavyweight service object that wastes system
 *  resources by being always up, even though you only need it from time to time.
 *  -> Instead of creating the object when tha app launches, you can delay the object's initialization to a time when
 *  it's really needed
 *  -> Local execution of a remote service(remote proxy). This is when the service object is located on a remote server.
 *  -> In this case, the proxy passes the client request over the network, handling all of the nasty details of working
 *  with the network.
 *  -> Caching request results (caching proxy). This is when you need to cache results of client requests and manage the
 *  life cycle if this cache, especially if results are quite large.
 *  -> The proxy can implement caching for recurring requests that always yield the same results. The proxy may use the
 *  parameters of requests as the cache keys.
 *  -> Access control (protection proxy). This is when you want only specific clients to be able to use the service
 *  object;
 *  -> Logging requests (logging proxy). This is when you want to keep history of requests to the service object.
 *  -> Smart reference. This is when you need to be able to dismiss a heavyweight object once there are no clients
 *  that use it.
 */
fun main(){
    val aYouTubeProxy = CachedYoutubeClass()

    println("${aYouTubeProxy.listVideos()} ${aYouTubeProxy.donwloadVideo(10)} ${aYouTubeProxy.getVideoInfo(10)}")
}