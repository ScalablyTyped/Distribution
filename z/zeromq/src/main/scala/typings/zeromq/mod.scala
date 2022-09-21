package typings.zeromq

import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.zeromq.anon.PartialSocketOptions
import typings.zeromq.zeromqStrings._fd
import typings.zeromq.zeromqStrings._ioevents
import typings.zeromq.zeromqStrings._receiveMore
import typings.zeromq.zeromqStrings._subscribe
import typings.zeromq.zeromqStrings._unsubscribe
import typings.zeromq.zeromqStrings.affinity
import typings.zeromq.zeromqStrings.backlog
import typings.zeromq.zeromqStrings.connect_timeout
import typings.zeromq.zeromqStrings.curve_publickey
import typings.zeromq.zeromqStrings.curve_secretkey
import typings.zeromq.zeromqStrings.curve_server
import typings.zeromq.zeromqStrings.curve_serverkey
import typings.zeromq.zeromqStrings.dealer
import typings.zeromq.zeromqStrings.heartbeat_ivl
import typings.zeromq.zeromqStrings.heartbeat_timeout
import typings.zeromq.zeromqStrings.heartbeat_ttl
import typings.zeromq.zeromqStrings.hwm
import typings.zeromq.zeromqStrings.identity
import typings.zeromq.zeromqStrings.last_endpoint
import typings.zeromq.zeromqStrings.linger
import typings.zeromq.zeromqStrings.mcast_loop
import typings.zeromq.zeromqStrings.mechanism
import typings.zeromq.zeromqStrings.pair
import typings.zeromq.zeromqStrings.plain_password
import typings.zeromq.zeromqStrings.plain_server
import typings.zeromq.zeromqStrings.plain_username
import typings.zeromq.zeromqStrings.pub
import typings.zeromq.zeromqStrings.pull
import typings.zeromq.zeromqStrings.push
import typings.zeromq.zeromqStrings.rate
import typings.zeromq.zeromqStrings.rcvbuf
import typings.zeromq.zeromqStrings.reconnect_ivl
import typings.zeromq.zeromqStrings.recovery_ivl
import typings.zeromq.zeromqStrings.rep
import typings.zeromq.zeromqStrings.req
import typings.zeromq.zeromqStrings.router
import typings.zeromq.zeromqStrings.sndbuf
import typings.zeromq.zeromqStrings.stream
import typings.zeromq.zeromqStrings.sub
import typings.zeromq.zeromqStrings.swap
import typings.zeromq.zeromqStrings.xpub
import typings.zeromq.zeromqStrings.xrep
import typings.zeromq.zeromqStrings.xreq
import typings.zeromq.zeromqStrings.xsub
import typings.zeromq.zeromqStrings.zap_domain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zeromq", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("zeromq", "Context")
  @js.native
  open class Context () extends StObject {
    
    def close(): Unit = js.native
  }
  /* static members */
  object Context {
    
    @JSImport("zeromq", "Context")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getMaxSockets(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxSockets")().asInstanceOf[Double]
    
    inline def getMaxThreads(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxThreads")().asInstanceOf[Double]
    
    inline def setMaxSockets(value: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMaxSockets")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setMaxThreads(value: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMaxThreads")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("zeromq", "Socket")
  @js.native
  open class Socket_ protected () extends EventEmitter {
    /**
      * @param type keyof SocketTypes | SocketTypes[keyof SocketTypes]
      */
    def this(`type`: pub | xpub | sub | xsub | req | xreq | rep | xrep | push | pull | dealer | router | pair | stream) = this()
    def this(`type`: Double) = this()
    
    // Socket Options
    var _fd: Double = js.native
    
    var _ioevents: Double = js.native
    
    var _receiveMore: Double = js.native
    
    var _subscribe: Double = js.native
    
    var _unsubscribe: Double = js.native
    
    var affinity: Double = js.native
    
    var backlog: Double = js.native
    
    /**
      * Async bind.
      *
      * Emits the "bind" event.
      *
      * @param addr Socket address
      * @param cb Bind callback
      */
    def bind(addr: String): this.type = js.native
    def bind(addr: String, callback: js.Function1[/* error */ js.UndefOr[String], Unit]): this.type = js.native
    
    /**
      * Sync bind.
      *
      * @param addr Socket address
      */
    def bindSync(addr: String): this.type = js.native
    
    /**
      * Close the socket.
      *
      */
    def close(): this.type = js.native
    
    /**
      * Return true if socket state is closed
      */
    val closed: Boolean = js.native
    
    /**
      * Connect to `addr`.
      *
      * @param addr Connection address
      */
    def connect(addr: String): this.type = js.native
    
    var connect_timeout: Double = js.native
    
    var curve_publickey: String | Buffer = js.native
    
    var curve_secretkey: String | Buffer = js.native
    
    var curve_server: Double = js.native
    
    var curve_serverkey: String | Buffer = js.native
    
    /**
      * Disconnect from `addr`.
      *
      * @param addr The address
      */
    def disconnect(addr: String): this.type = js.native
    
    def getsockopt(opt: Double): String = js.native
    /**
      * Get socket `opt`.
      *
      * @param opt Option number
      */
    @JSName("getsockopt")
    def getsockopt_Double(opt: Double): Double = js.native
    @JSName("getsockopt")
    def getsockopt_Union(opt: Double): String | Buffer = js.native
    @JSName("getsockopt")
    def getsockopt_affinity(opt: affinity): Double = js.native
    @JSName("getsockopt")
    def getsockopt_backlog(opt: backlog): Double = js.native
    @JSName("getsockopt")
    def getsockopt_connecttimeout(opt: connect_timeout): Double = js.native
    @JSName("getsockopt")
    def getsockopt_curvepublickey(opt: curve_publickey): String | Buffer = js.native
    @JSName("getsockopt")
    def getsockopt_curvesecretkey(opt: curve_secretkey): String | Buffer = js.native
    @JSName("getsockopt")
    def getsockopt_curveserver(opt: curve_server): Double = js.native
    @JSName("getsockopt")
    def getsockopt_curveserverkey(opt: curve_serverkey): String | Buffer = js.native
    @JSName("getsockopt")
    def getsockopt_fd(opt: _fd): Double = js.native
    @JSName("getsockopt")
    def getsockopt_heartbeativl(opt: heartbeat_ivl): Double = js.native
    @JSName("getsockopt")
    def getsockopt_heartbeattimeout(opt: heartbeat_timeout): Double = js.native
    @JSName("getsockopt")
    def getsockopt_heartbeatttl(opt: heartbeat_ttl): Double = js.native
    @JSName("getsockopt")
    def getsockopt_hwm(opt: hwm): Double = js.native
    @JSName("getsockopt")
    def getsockopt_identity(opt: identity): Double = js.native
    @JSName("getsockopt")
    def getsockopt_ioevents(opt: _ioevents): Double = js.native
    @JSName("getsockopt")
    def getsockopt_lastendpoint(opt: last_endpoint): Double = js.native
    @JSName("getsockopt")
    def getsockopt_linger(opt: linger): Double = js.native
    @JSName("getsockopt")
    def getsockopt_mcastloop(opt: mcast_loop): Double = js.native
    @JSName("getsockopt")
    def getsockopt_mechanism(opt: mechanism): Double = js.native
    @JSName("getsockopt")
    def getsockopt_plainpassword(opt: plain_password): String = js.native
    @JSName("getsockopt")
    def getsockopt_plainserver(opt: plain_server): Double = js.native
    @JSName("getsockopt")
    def getsockopt_plainusername(opt: plain_username): String = js.native
    @JSName("getsockopt")
    def getsockopt_rate(opt: rate): Double = js.native
    @JSName("getsockopt")
    def getsockopt_rcvbuf(opt: rcvbuf): Double = js.native
    @JSName("getsockopt")
    def getsockopt_receiveMore(opt: _receiveMore): Double = js.native
    @JSName("getsockopt")
    def getsockopt_reconnectivl(opt: reconnect_ivl): Double = js.native
    @JSName("getsockopt")
    def getsockopt_recoveryivl(opt: recovery_ivl): Double = js.native
    @JSName("getsockopt")
    def getsockopt_sndbuf(opt: sndbuf): Double = js.native
    @JSName("getsockopt")
    def getsockopt_subscribe(opt: _subscribe): Double = js.native
    @JSName("getsockopt")
    def getsockopt_swap(opt: swap): Double = js.native
    @JSName("getsockopt")
    def getsockopt_unsubscribe(opt: _unsubscribe): Double = js.native
    @JSName("getsockopt")
    def getsockopt_zapdomain(opt: zap_domain): String = js.native
    
    var heartbeat_ivl: Double = js.native
    
    var heartbeat_timeout: Double = js.native
    
    var heartbeat_ttl: Double = js.native
    
    var hwm: Double = js.native
    
    var identity: Double = js.native
    
    var last_endpoint: Double = js.native
    
    var linger: Double = js.native
    
    var mcast_loop: Double = js.native
    
    var mechanism: Double = js.native
    
    /**
      * Enable monitoring of a Socket. This enables the following additional events:
      * 'connect', 'connect_delay', 'connect_retry', 'listen', 'bind_error',
      * 'accept', 'accept_error', 'close', 'close_error', 'disconnect'.
      * Each event receives the parameters: (eventValue, eventEndpointAddrress, error)
      *
      * @param timer interval in ms > 0 or Undefined for default
      * @param numOfEvents The maximum number of events to read on each interval, default is 1, use 0 for reading all events
      * @return for chaining
      */
    def monitor(): this.type = js.native
    def monitor(interval: Double): this.type = js.native
    def monitor(interval: Double, numOfEvents: Double): this.type = js.native
    def monitor(interval: Unit, numOfEvents: Double): this.type = js.native
    
    def pause(): Unit = js.native
    
    var plain_password: String = js.native
    
    var plain_server: Double = js.native
    
    var plain_username: String = js.native
    
    var rate: Double = js.native
    
    var rcvbuf: Double = js.native
    
    var reconnect_ivl: Double = js.native
    
    var recovery_ivl: Double = js.native
    
    def resume(): Unit = js.native
    
    /**
      * Send the given `msg`.
      *
      * @param msg The message
      * @param flags Message flags
      * @param cb The callback to be called when the message will be sent or fails to be sent
      */
    def send(msg: String): this.type = js.native
    def send(msg: String, flags: Double): this.type = js.native
    def send(msg: String, flags: Double, cb: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): this.type = js.native
    def send(msg: String, flags: Unit, cb: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): this.type = js.native
    def send(msg: js.Array[Any]): this.type = js.native
    def send(msg: js.Array[Any], flags: Double): this.type = js.native
    def send(msg: js.Array[Any], flags: Double, cb: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): this.type = js.native
    def send(msg: js.Array[Any], flags: Unit, cb: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): this.type = js.native
    def send(msg: Buffer): this.type = js.native
    def send(msg: Buffer, flags: Double): this.type = js.native
    def send(msg: Buffer, flags: Double, cb: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): this.type = js.native
    def send(msg: Buffer, flags: Unit, cb: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): this.type = js.native
    
    def setsockopt(opt: Double, `val`: String): this.type = js.native
    /**
      * Set `opt` to `val`.
      *
      * @param opt Option
      * @param val Value
      */
    def setsockopt(opt: Double, `val`: Double): this.type = js.native
    def setsockopt(opt: Double, `val`: Buffer): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_affinity(opt: affinity, `val`: Double): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_backlog(opt: backlog, `val`: Double): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_connecttimeout(opt: connect_timeout, `val`: Double): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_curvepublickey(opt: curve_publickey, `val`: String): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_curvepublickey(opt: curve_publickey, `val`: Buffer): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_curvesecretkey(opt: curve_secretkey, `val`: String): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_curvesecretkey(opt: curve_secretkey, `val`: Buffer): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_curveserver(opt: curve_server, `val`: Double): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_curveserverkey(opt: curve_serverkey, `val`: String): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_curveserverkey(opt: curve_serverkey, `val`: Buffer): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_fd(opt: _fd, `val`: Double): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_heartbeativl(opt: heartbeat_ivl, `val`: Double): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_heartbeattimeout(opt: heartbeat_timeout, `val`: Double): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_heartbeatttl(opt: heartbeat_ttl, `val`: Double): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_hwm(opt: hwm, `val`: Double): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_identity(opt: identity, `val`: Double): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_ioevents(opt: _ioevents, `val`: Double): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_lastendpoint(opt: last_endpoint, `val`: Double): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_linger(opt: linger, `val`: Double): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_mcastloop(opt: mcast_loop, `val`: Double): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_mechanism(opt: mechanism, `val`: Double): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_plainpassword(opt: plain_password, `val`: String): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_plainserver(opt: plain_server, `val`: Double): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_plainusername(opt: plain_username, `val`: String): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_rate(opt: rate, `val`: Double): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_rcvbuf(opt: rcvbuf, `val`: Double): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_receiveMore(opt: _receiveMore, `val`: Double): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_reconnectivl(opt: reconnect_ivl, `val`: Double): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_recoveryivl(opt: recovery_ivl, `val`: Double): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_sndbuf(opt: sndbuf, `val`: Double): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_subscribe(opt: _subscribe, `val`: Double): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_swap(opt: swap, `val`: Double): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_unsubscribe(opt: _unsubscribe, `val`: Double): this.type = js.native
    @JSName("setsockopt")
    def setsockopt_zapdomain(opt: zap_domain, `val`: String): this.type = js.native
    
    var sndbuf: Double = js.native
    
    /**
      * Subscribe with the given `filter`.
      *
      * @param filter The filter
      */
    def subscribe(filter: String): this.type = js.native
    
    var swap: Double = js.native
    
    /**
      * Async unbind.
      *
      * Emits the "unbind" event.
      *
      * @param addr Socket address
      * @param cb Unind callback
      */
    def unbind(addr: String): this.type = js.native
    def unbind(addr: String, callback: js.Function1[/* error */ js.UndefOr[String], Unit]): this.type = js.native
    
    /**
      * Sync unbind.
      *
      * @param addr Socket address
      */
    def unbindSync(addr: String): this.type = js.native
    
    /**
      * Disable monitoring of a Socket release idle handler
      * and close the socket
      *
      * @return for chaining
      */
    def unmonitor(): this.type = js.native
    
    /**
      * Unsubscribe with the given `filter`.
      *
      * @param filter The filter
      */
    def unsubscribe(filter: String): this.type = js.native
    
    var zap_domain: String = js.native
  }
  
  @JSImport("zeromq", "ZMQ_AFFINITY")
  @js.native
  val ZMQ_AFFINITY: Double = js.native
  
  @JSImport("zeromq", "ZMQ_BACKLOG")
  @js.native
  val ZMQ_BACKLOG: Double = js.native
  
  @JSImport("zeromq", "ZMQ_CONNECT_TIMEOUT")
  @js.native
  val ZMQ_CONNECT_TIMEOUT: Double = js.native
  
  @JSImport("zeromq", "ZMQ_CURVE_PUBLICKEY")
  @js.native
  val ZMQ_CURVE_PUBLICKEY: Double = js.native
  
  @JSImport("zeromq", "ZMQ_CURVE_SECRETKEY")
  @js.native
  val ZMQ_CURVE_SECRETKEY: Double = js.native
  
  @JSImport("zeromq", "ZMQ_CURVE_SERVER")
  @js.native
  val ZMQ_CURVE_SERVER: Double = js.native
  
  @JSImport("zeromq", "ZMQ_CURVE_SERVERKEY")
  @js.native
  val ZMQ_CURVE_SERVERKEY: Double = js.native
  
  @JSImport("zeromq", "ZMQ_DELAY_ATTACH_ON_CONNECT")
  @js.native
  val ZMQ_DELAY_ATTACH_ON_CONNECT: Double = js.native
  
  @JSImport("zeromq", "ZMQ_EVENTS")
  @js.native
  val ZMQ_EVENTS: Double = js.native
  
  @JSImport("zeromq", "ZMQ_FD")
  @js.native
  val ZMQ_FD: Double = js.native
  
  @JSImport("zeromq", "ZMQ_HEARTBEAT_IVL")
  @js.native
  val ZMQ_HEARTBEAT_IVL: Double = js.native
  
  @JSImport("zeromq", "ZMQ_HEARTBEAT_TIMEOUT")
  @js.native
  val ZMQ_HEARTBEAT_TIMEOUT: Double = js.native
  
  @JSImport("zeromq", "ZMQ_HEARTBEAT_TTL")
  @js.native
  val ZMQ_HEARTBEAT_TTL: Double = js.native
  
  @JSImport("zeromq", "ZMQ_HWM")
  @js.native
  val ZMQ_HWM: Double = js.native
  
  @JSImport("zeromq", "ZMQ_IDENTITY")
  @js.native
  val ZMQ_IDENTITY: Double = js.native
  
  @JSImport("zeromq", "ZMQ_IO_THREADS")
  @js.native
  val ZMQ_IO_THREADS: Double = js.native
  
  @JSImport("zeromq", "ZMQ_IPV4ONLY")
  @js.native
  val ZMQ_IPV4ONLY: Double = js.native
  
  @JSImport("zeromq", "ZMQ_IPV6")
  @js.native
  val ZMQ_IPV6: Double = js.native
  
  @JSImport("zeromq", "ZMQ_LAST_ENDPOINT")
  @js.native
  val ZMQ_LAST_ENDPOINT: Double = js.native
  
  @JSImport("zeromq", "ZMQ_LINGER")
  @js.native
  val ZMQ_LINGER: Double = js.native
  
  @JSImport("zeromq", "ZMQ_MAXMSGSIZE")
  @js.native
  val ZMQ_MAXMSGSIZE: Double = js.native
  
  @JSImport("zeromq", "ZMQ_MAX_SOCKETS")
  @js.native
  val ZMQ_MAX_SOCKETS: Double = js.native
  
  @JSImport("zeromq", "ZMQ_MCAST_LOOP")
  @js.native
  val ZMQ_MCAST_LOOP: Double = js.native
  
  @JSImport("zeromq", "ZMQ_MECHANISM")
  @js.native
  val ZMQ_MECHANISM: Double = js.native
  
  @JSImport("zeromq", "ZMQ_MULTICAST_HOPS")
  @js.native
  val ZMQ_MULTICAST_HOPS: Double = js.native
  
  @JSImport("zeromq", "ZMQ_PLAIN_PASSWORD")
  @js.native
  val ZMQ_PLAIN_PASSWORD: Double = js.native
  
  @JSImport("zeromq", "ZMQ_PLAIN_SERVER")
  @js.native
  val ZMQ_PLAIN_SERVER: Double = js.native
  
  @JSImport("zeromq", "ZMQ_PLAIN_USERNAME")
  @js.native
  val ZMQ_PLAIN_USERNAME: Double = js.native
  
  @JSImport("zeromq", "ZMQ_RATE")
  @js.native
  val ZMQ_RATE: Double = js.native
  
  @JSImport("zeromq", "ZMQ_RCVBUF")
  @js.native
  val ZMQ_RCVBUF: Double = js.native
  
  @JSImport("zeromq", "ZMQ_RCVHWM")
  @js.native
  val ZMQ_RCVHWM: Double = js.native
  
  @JSImport("zeromq", "ZMQ_RCVMORE")
  @js.native
  val ZMQ_RCVMORE: Double = js.native
  
  @JSImport("zeromq", "ZMQ_RCVTIMEO")
  @js.native
  val ZMQ_RCVTIMEO: Double = js.native
  
  @JSImport("zeromq", "ZMQ_RECONNECT_IVL")
  @js.native
  val ZMQ_RECONNECT_IVL: Double = js.native
  
  @JSImport("zeromq", "ZMQ_RECONNECT_IVL_MAX")
  @js.native
  val ZMQ_RECONNECT_IVL_MAX: Double = js.native
  
  @JSImport("zeromq", "ZMQ_RECOVERY_IVL")
  @js.native
  val ZMQ_RECOVERY_IVL: Double = js.native
  
  @JSImport("zeromq", "ZMQ_RECOVERY_IVL_MSEC")
  @js.native
  val ZMQ_RECOVERY_IVL_MSEC: Double = js.native
  
  @JSImport("zeromq", "ZMQ_ROUTER_HANDOVER")
  @js.native
  val ZMQ_ROUTER_HANDOVER: Double = js.native
  
  @JSImport("zeromq", "ZMQ_ROUTER_MANDATORY")
  @js.native
  val ZMQ_ROUTER_MANDATORY: Double = js.native
  
  @JSImport("zeromq", "ZMQ_ROUTER_RAW")
  @js.native
  val ZMQ_ROUTER_RAW: Double = js.native
  
  @JSImport("zeromq", "ZMQ_SNDBUF")
  @js.native
  val ZMQ_SNDBUF: Double = js.native
  
  @JSImport("zeromq", "ZMQ_SNDHWM")
  @js.native
  val ZMQ_SNDHWM: Double = js.native
  
  @JSImport("zeromq", "ZMQ_SNDTIMEO")
  @js.native
  val ZMQ_SNDTIMEO: Double = js.native
  
  @JSImport("zeromq", "ZMQ_SUBSCRIBE")
  @js.native
  val ZMQ_SUBSCRIBE: Double = js.native
  
  @JSImport("zeromq", "ZMQ_SWAP")
  @js.native
  val ZMQ_SWAP: Double = js.native
  
  @JSImport("zeromq", "ZMQ_TCP_ACCEPT_FILTER")
  @js.native
  val ZMQ_TCP_ACCEPT_FILTER: Double = js.native
  
  @JSImport("zeromq", "ZMQ_TCP_KEEPALIVE")
  @js.native
  val ZMQ_TCP_KEEPALIVE: Double = js.native
  
  @JSImport("zeromq", "ZMQ_TCP_KEEPALIVE_CNT")
  @js.native
  val ZMQ_TCP_KEEPALIVE_CNT: Double = js.native
  
  @JSImport("zeromq", "ZMQ_TCP_KEEPALIVE_IDLE")
  @js.native
  val ZMQ_TCP_KEEPALIVE_IDLE: Double = js.native
  
  @JSImport("zeromq", "ZMQ_TCP_KEEPALIVE_INTVL")
  @js.native
  val ZMQ_TCP_KEEPALIVE_INTVL: Double = js.native
  
  @JSImport("zeromq", "ZMQ_TYPE")
  @js.native
  val ZMQ_TYPE: Double = js.native
  
  @JSImport("zeromq", "ZMQ_UNSUBSCRIBE")
  @js.native
  val ZMQ_UNSUBSCRIBE: Double = js.native
  
  @JSImport("zeromq", "ZMQ_XPUB_VERBOSE")
  @js.native
  val ZMQ_XPUB_VERBOSE: Double = js.native
  
  @JSImport("zeromq", "ZMQ_ZAP_DOMAIN")
  @js.native
  val ZMQ_ZAP_DOMAIN: Double = js.native
  
  inline def createSocket(
    `type`: pub | xpub | sub | xsub | req | xreq | rep | xrep | push | pull | dealer | router | pair | stream
  ): Socket_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createSocket")(`type`.asInstanceOf[js.Any]).asInstanceOf[Socket_]
  inline def createSocket(
    `type`: pub | xpub | sub | xsub | req | xreq | rep | xrep | push | pull | dealer | router | pair | stream,
    options: PartialSocketOptions
  ): Socket_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createSocket")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Socket_]
  inline def createSocket(`type`: Double): Socket_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createSocket")(`type`.asInstanceOf[js.Any]).asInstanceOf[Socket_]
  inline def createSocket(`type`: Double, options: PartialSocketOptions): Socket_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createSocket")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Socket_]
  
  inline def curveKeypair(): CurveKeyPair_ = ^.asInstanceOf[js.Dynamic].applyDynamic("curveKeypair")().asInstanceOf[CurveKeyPair_]
  
  @JSImport("zeromq", "options")
  @js.native
  def options: SocketOptions = js.native
  inline def options_=(x: SocketOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  
  inline def proxy(frontend: Socket_, backend: Socket_): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("proxy")(frontend.asInstanceOf[js.Any], backend.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def proxy(frontend: Socket_, backend: Socket_, capture: Socket_): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("proxy")(frontend.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def socket(
    `type`: pub | xpub | sub | xsub | req | xreq | rep | xrep | push | pull | dealer | router | pair | stream
  ): Socket_ = ^.asInstanceOf[js.Dynamic].applyDynamic("socket")(`type`.asInstanceOf[js.Any]).asInstanceOf[Socket_]
  inline def socket(
    `type`: pub | xpub | sub | xsub | req | xreq | rep | xrep | push | pull | dealer | router | pair | stream,
    options: PartialSocketOptions
  ): Socket_ = (^.asInstanceOf[js.Dynamic].applyDynamic("socket")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Socket_]
  inline def socket(`type`: Double): Socket_ = ^.asInstanceOf[js.Dynamic].applyDynamic("socket")(`type`.asInstanceOf[js.Any]).asInstanceOf[Socket_]
  inline def socket(`type`: Double, options: PartialSocketOptions): Socket_ = (^.asInstanceOf[js.Dynamic].applyDynamic("socket")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Socket_]
  
  @JSImport("zeromq", "types")
  @js.native
  def types: SocketTypes = js.native
  inline def types_=(x: SocketTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("types")(x.asInstanceOf[js.Any])
  
  @JSImport("zeromq", "version")
  @js.native
  def version: String = js.native
  inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  trait CurveKeyPair_ extends StObject {
    
    /**
      * A Z85 string denoting the public portion of the Curve25519 key.
      *
      */
    var public: String
    
    /**
      * A Z85 string denoting the private, secret portion of the Curve25519 key.
      *
      */
    var secret: String
  }
  object CurveKeyPair_ {
    
    inline def apply(public: String, secret: String): CurveKeyPair_ = {
      val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurveKeyPair_]
    }
    
    extension [Self <: CurveKeyPair_](x: Self) {
      
      inline def setPublic(value: String): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    }
  }
  
  trait SocketOptions extends StObject {
    
    var _fd: Double
    
    var _ioevents: Double
    
    var _receiveMore: Double
    
    var _subscribe: Double
    
    var _unsubscribe: Double
    
    var affinity: Double
    
    var backlog: Double
    
    var connect_timeout: Double
    
    var curve_publickey: String | Buffer
    
    var curve_secretkey: String | Buffer
    
    var curve_server: Double
    
    var curve_serverkey: String | Buffer
    
    var heartbeat_ivl: Double
    
    var heartbeat_timeout: Double
    
    var heartbeat_ttl: Double
    
    var hwm: Double
    
    var identity: Double
    
    var last_endpoint: Double
    
    var linger: Double
    
    var mcast_loop: Double
    
    var mechanism: Double
    
    var plain_password: String
    
    var plain_server: Double
    
    var plain_username: String
    
    var rate: Double
    
    var rcvbuf: Double
    
    var reconnect_ivl: Double
    
    var recovery_ivl: Double
    
    var sndbuf: Double
    
    var swap: Double
    
    var zap_domain: String
  }
  object SocketOptions {
    
    inline def apply(
      _fd: Double,
      _ioevents: Double,
      _receiveMore: Double,
      _subscribe: Double,
      _unsubscribe: Double,
      affinity: Double,
      backlog: Double,
      connect_timeout: Double,
      curve_publickey: String | Buffer,
      curve_secretkey: String | Buffer,
      curve_server: Double,
      curve_serverkey: String | Buffer,
      heartbeat_ivl: Double,
      heartbeat_timeout: Double,
      heartbeat_ttl: Double,
      hwm: Double,
      identity: Double,
      last_endpoint: Double,
      linger: Double,
      mcast_loop: Double,
      mechanism: Double,
      plain_password: String,
      plain_server: Double,
      plain_username: String,
      rate: Double,
      rcvbuf: Double,
      reconnect_ivl: Double,
      recovery_ivl: Double,
      sndbuf: Double,
      swap: Double,
      zap_domain: String
    ): SocketOptions = {
      val __obj = js.Dynamic.literal(_fd = _fd.asInstanceOf[js.Any], _ioevents = _ioevents.asInstanceOf[js.Any], _receiveMore = _receiveMore.asInstanceOf[js.Any], _subscribe = _subscribe.asInstanceOf[js.Any], _unsubscribe = _unsubscribe.asInstanceOf[js.Any], affinity = affinity.asInstanceOf[js.Any], backlog = backlog.asInstanceOf[js.Any], connect_timeout = connect_timeout.asInstanceOf[js.Any], curve_publickey = curve_publickey.asInstanceOf[js.Any], curve_secretkey = curve_secretkey.asInstanceOf[js.Any], curve_server = curve_server.asInstanceOf[js.Any], curve_serverkey = curve_serverkey.asInstanceOf[js.Any], heartbeat_ivl = heartbeat_ivl.asInstanceOf[js.Any], heartbeat_timeout = heartbeat_timeout.asInstanceOf[js.Any], heartbeat_ttl = heartbeat_ttl.asInstanceOf[js.Any], hwm = hwm.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], last_endpoint = last_endpoint.asInstanceOf[js.Any], linger = linger.asInstanceOf[js.Any], mcast_loop = mcast_loop.asInstanceOf[js.Any], mechanism = mechanism.asInstanceOf[js.Any], plain_password = plain_password.asInstanceOf[js.Any], plain_server = plain_server.asInstanceOf[js.Any], plain_username = plain_username.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any], rcvbuf = rcvbuf.asInstanceOf[js.Any], reconnect_ivl = reconnect_ivl.asInstanceOf[js.Any], recovery_ivl = recovery_ivl.asInstanceOf[js.Any], sndbuf = sndbuf.asInstanceOf[js.Any], swap = swap.asInstanceOf[js.Any], zap_domain = zap_domain.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketOptions]
    }
    
    extension [Self <: SocketOptions](x: Self) {
      
      inline def setAffinity(value: Double): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
      
      inline def setBacklog(value: Double): Self = StObject.set(x, "backlog", value.asInstanceOf[js.Any])
      
      inline def setConnect_timeout(value: Double): Self = StObject.set(x, "connect_timeout", value.asInstanceOf[js.Any])
      
      inline def setCurve_publickey(value: String | Buffer): Self = StObject.set(x, "curve_publickey", value.asInstanceOf[js.Any])
      
      inline def setCurve_secretkey(value: String | Buffer): Self = StObject.set(x, "curve_secretkey", value.asInstanceOf[js.Any])
      
      inline def setCurve_server(value: Double): Self = StObject.set(x, "curve_server", value.asInstanceOf[js.Any])
      
      inline def setCurve_serverkey(value: String | Buffer): Self = StObject.set(x, "curve_serverkey", value.asInstanceOf[js.Any])
      
      inline def setHeartbeat_ivl(value: Double): Self = StObject.set(x, "heartbeat_ivl", value.asInstanceOf[js.Any])
      
      inline def setHeartbeat_timeout(value: Double): Self = StObject.set(x, "heartbeat_timeout", value.asInstanceOf[js.Any])
      
      inline def setHeartbeat_ttl(value: Double): Self = StObject.set(x, "heartbeat_ttl", value.asInstanceOf[js.Any])
      
      inline def setHwm(value: Double): Self = StObject.set(x, "hwm", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: Double): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setLast_endpoint(value: Double): Self = StObject.set(x, "last_endpoint", value.asInstanceOf[js.Any])
      
      inline def setLinger(value: Double): Self = StObject.set(x, "linger", value.asInstanceOf[js.Any])
      
      inline def setMcast_loop(value: Double): Self = StObject.set(x, "mcast_loop", value.asInstanceOf[js.Any])
      
      inline def setMechanism(value: Double): Self = StObject.set(x, "mechanism", value.asInstanceOf[js.Any])
      
      inline def setPlain_password(value: String): Self = StObject.set(x, "plain_password", value.asInstanceOf[js.Any])
      
      inline def setPlain_server(value: Double): Self = StObject.set(x, "plain_server", value.asInstanceOf[js.Any])
      
      inline def setPlain_username(value: String): Self = StObject.set(x, "plain_username", value.asInstanceOf[js.Any])
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setRcvbuf(value: Double): Self = StObject.set(x, "rcvbuf", value.asInstanceOf[js.Any])
      
      inline def setReconnect_ivl(value: Double): Self = StObject.set(x, "reconnect_ivl", value.asInstanceOf[js.Any])
      
      inline def setRecovery_ivl(value: Double): Self = StObject.set(x, "recovery_ivl", value.asInstanceOf[js.Any])
      
      inline def setSndbuf(value: Double): Self = StObject.set(x, "sndbuf", value.asInstanceOf[js.Any])
      
      inline def setSwap(value: Double): Self = StObject.set(x, "swap", value.asInstanceOf[js.Any])
      
      inline def setZap_domain(value: String): Self = StObject.set(x, "zap_domain", value.asInstanceOf[js.Any])
      
      inline def set_fd(value: Double): Self = StObject.set(x, "_fd", value.asInstanceOf[js.Any])
      
      inline def set_ioevents(value: Double): Self = StObject.set(x, "_ioevents", value.asInstanceOf[js.Any])
      
      inline def set_receiveMore(value: Double): Self = StObject.set(x, "_receiveMore", value.asInstanceOf[js.Any])
      
      inline def set_subscribe(value: Double): Self = StObject.set(x, "_subscribe", value.asInstanceOf[js.Any])
      
      inline def set_unsubscribe(value: Double): Self = StObject.set(x, "_unsubscribe", value.asInstanceOf[js.Any])
    }
  }
  
  trait SocketTypes extends StObject {
    
    var dealer: Double
    
    var pair: Double
    
    var pub: Double
    
    var pull: Double
    
    var push: Double
    
    var rep: Double
    
    var req: Double
    
    var router: Double
    
    var stream: Double
    
    var sub: Double
    
    var xpub: Double
    
    var xrep: Double
    
    var xreq: Double
    
    var xsub: Double
  }
  object SocketTypes {
    
    inline def apply(
      dealer: Double,
      pair: Double,
      pub: Double,
      pull: Double,
      push: Double,
      rep: Double,
      req: Double,
      router: Double,
      stream: Double,
      sub: Double,
      xpub: Double,
      xrep: Double,
      xreq: Double,
      xsub: Double
    ): SocketTypes = {
      val __obj = js.Dynamic.literal(dealer = dealer.asInstanceOf[js.Any], pair = pair.asInstanceOf[js.Any], pub = pub.asInstanceOf[js.Any], pull = pull.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], rep = rep.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], xpub = xpub.asInstanceOf[js.Any], xrep = xrep.asInstanceOf[js.Any], xreq = xreq.asInstanceOf[js.Any], xsub = xsub.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketTypes]
    }
    
    extension [Self <: SocketTypes](x: Self) {
      
      inline def setDealer(value: Double): Self = StObject.set(x, "dealer", value.asInstanceOf[js.Any])
      
      inline def setPair(value: Double): Self = StObject.set(x, "pair", value.asInstanceOf[js.Any])
      
      inline def setPub(value: Double): Self = StObject.set(x, "pub", value.asInstanceOf[js.Any])
      
      inline def setPull(value: Double): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
      
      inline def setPush(value: Double): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setRep(value: Double): Self = StObject.set(x, "rep", value.asInstanceOf[js.Any])
      
      inline def setReq(value: Double): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setRouter(value: Double): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      inline def setStream(value: Double): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setSub(value: Double): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setXpub(value: Double): Self = StObject.set(x, "xpub", value.asInstanceOf[js.Any])
      
      inline def setXrep(value: Double): Self = StObject.set(x, "xrep", value.asInstanceOf[js.Any])
      
      inline def setXreq(value: Double): Self = StObject.set(x, "xreq", value.asInstanceOf[js.Any])
      
      inline def setXsub(value: Double): Self = StObject.set(x, "xsub", value.asInstanceOf[js.Any])
    }
  }
}
