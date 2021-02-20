package typings.zeromq

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zeromq", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("zeromq", "Socket")
  @js.native
  class Socket_ () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    // Socket Options
    var _fd: js.Any = js.native
    
    var _ioevents: js.Any = js.native
    
    var _receiveMore: js.Any = js.native
    
    var _subscribe: js.Any = js.native
    
    var _unsubscribe: js.Any = js.native
    
    var affinity: js.Any = js.native
    
    def backlog(): js.Any = js.native
    
    /**
      * Async bind.
      *
      * Emits the "bind" event.
      *
      * @param addr Socket address
      * @param cb Bind callback
      */
    def bind(addr: String): Socket_ = js.native
    def bind(addr: String, callback: js.Function1[/* error */ String, Unit]): Socket_ = js.native
    
    /**
      * Sync bind.
      *
      * @param addr Socket address
      */
    def bindSync(addr: String): Socket_ = js.native
    
    /**
      * Close the socket.
      *
      */
    def close(): Socket_ = js.native
    
    /**
      * Connect to `addr`.
      *
      * @param addr Connection address
      */
    def connect(addr: String): Socket_ = js.native
    
    var curve_publickey: String | Buffer = js.native
    
    var curve_secretkey: String | Buffer = js.native
    
    var curve_server: Double = js.native
    
    var curve_serverkey: String | Buffer = js.native
    
    /**
      * Disconnect from `addr`.
      *
      * @param addr The address
      */
    def disconnect(addr: String): Socket_ = js.native
    
    def getsockopt(opt: String): js.Any = js.native
    /**
      * Get socket `opt`.
      *
      * @param opt Option number
      */
    def getsockopt(opt: Double): js.Any = js.native
    
    var hwm: js.Any = js.native
    
    var identity: js.Any = js.native
    
    var last_endpoint: js.Any = js.native
    
    var linger: js.Any = js.native
    
    var mcast_loop: js.Any = js.native
    
    var mechanism: js.Any = js.native
    
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
    def monitor(): Socket_ = js.native
    def monitor(interval: js.UndefOr[scala.Nothing], numOfEvents: Double): Socket_ = js.native
    def monitor(interval: Double): Socket_ = js.native
    def monitor(interval: Double, numOfEvents: Double): Socket_ = js.native
    
    def pause(): Unit = js.native
    
    var plain_password: js.Any = js.native
    
    var plain_server: js.Any = js.native
    
    var plain_username: js.Any = js.native
    
    var rate: js.Any = js.native
    
    var rcvbuf: js.Any = js.native
    
    var reconnect_ivl: js.Any = js.native
    
    var recovery_ivl: js.Any = js.native
    
    def resume(): Unit = js.native
    
    /**
      * Send the given `msg`.
      *
      * @param msg The message
      * @param flags Message flags
      */
    def send(msg: String): Socket_ = js.native
    def send(msg: String, flags: Double): Socket_ = js.native
    def send(msg: js.Array[_]): Socket_ = js.native
    def send(msg: js.Array[_], flags: Double): Socket_ = js.native
    def send(msg: Buffer): Socket_ = js.native
    def send(msg: Buffer, flags: Double): Socket_ = js.native
    
    def setsockopt(opt: String, `val`: js.Any): Socket_ = js.native
    /**
      * Set `opt` to `val`.
      *
      * @param opt Option
      * @param val Value
      */
    def setsockopt(opt: Double, `val`: js.Any): Socket_ = js.native
    
    var sndbuf: js.Any = js.native
    
    /**
      * Subscribe with the given `filter`.
      *
      * @param filter The filter
      */
    def subscribe(filter: String): Socket_ = js.native
    
    var swap: js.Any = js.native
    
    /**
      * Async unbind.
      *
      * Emits the "unbind" event.
      *
      * @param addr Socket address
      * @param cb Unind callback
      */
    def unbind(addr: String): Socket_ = js.native
    def unbind(addr: String, callback: js.Function1[/* error */ String, Unit]): Socket_ = js.native
    
    /**
      * Sync unbind.
      *
      * @param addr Socket address
      */
    def unbindSync(addr: String): Socket_ = js.native
    
    /**
      * Disable monitoring of a Socket release idle handler
      * and close the socket
      *
      * @return for chaining
      */
    def unmonitor(): Socket_ = js.native
    
    /**
      * Unsubscribe with the given `filter`.
      *
      * @param filter The filter
      */
    def unsubscribe(filter: String): Socket_ = js.native
    
    var zap_domain: js.Any = js.native
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
  
  @JSImport("zeromq", "createSocket")
  @js.native
  def createSocket(`type`: String): Socket_ = js.native
  @JSImport("zeromq", "createSocket")
  @js.native
  def createSocket(`type`: String, options: js.Any): Socket_ = js.native
  
  @JSImport("zeromq", "curveKeypair")
  @js.native
  def curveKeypair(): CurveKeyPair_ = js.native
  
  @JSImport("zeromq", "options")
  @js.native
  def options: SocketOptions = js.native
  @scala.inline
  def options_=(x: SocketOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  
  @JSImport("zeromq", "proxy")
  @js.native
  def proxy(frontend: Socket_, backend: Socket_): Unit = js.native
  @JSImport("zeromq", "proxy")
  @js.native
  def proxy(frontend: Socket_, backend: Socket_, capture: Socket_): Unit = js.native
  
  @JSImport("zeromq", "socket")
  @js.native
  def socket(`type`: String): Socket_ = js.native
  @JSImport("zeromq", "socket")
  @js.native
  def socket(`type`: String, options: js.Any): Socket_ = js.native
  @JSImport("zeromq", "socket")
  @js.native
  def socket(`type`: Double): Socket_ = js.native
  @JSImport("zeromq", "socket")
  @js.native
  def socket(`type`: Double, options: js.Any): Socket_ = js.native
  
  @JSImport("zeromq", "types")
  @js.native
  def types: SocketTypes = js.native
  @scala.inline
  def types_=(x: SocketTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("types")(x.asInstanceOf[js.Any])
  
  @JSImport("zeromq", "version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  @js.native
  trait CurveKeyPair_ extends StObject {
    
    /**
      * A Z85 string denoting the public portion of the Curve25519 key.
      *
      */
    var public: String = js.native
    
    /**
      * A Z85 string denoting the private, secret portion of the Curve25519 key.
      *
      */
    var secret: String = js.native
  }
  object CurveKeyPair_ {
    
    @scala.inline
    def apply(public: String, secret: String): CurveKeyPair_ = {
      val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurveKeyPair_]
    }
    
    @scala.inline
    implicit class CurveKeyPair_MutableBuilder[Self <: CurveKeyPair_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPublic(value: String): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SocketOptions extends StObject {
    
    var _fd: Double = js.native
    
    var _ioevents: Double = js.native
    
    var _receiveMore: Double = js.native
    
    var _subscribe: Double = js.native
    
    var _unsubscribe: Double = js.native
    
    var affinity: Double = js.native
    
    var backlog: Double = js.native
    
    var curve_publickey: Double = js.native
    
    var curve_secretkey: Double = js.native
    
    var curve_server: Double = js.native
    
    var curve_serverkey: Double = js.native
    
    var hwm: Double = js.native
    
    var identity: Double = js.native
    
    var last_endpoint: Double = js.native
    
    var linger: Double = js.native
    
    var mcast_loop: Double = js.native
    
    var mechanism: Double = js.native
    
    var plain_password: Double = js.native
    
    var plain_server: Double = js.native
    
    var plain_username: Double = js.native
    
    var rate: Double = js.native
    
    var rcvbuf: Double = js.native
    
    var reconnect_ivl: Double = js.native
    
    var recovery_ivl: Double = js.native
    
    var sndbuf: Double = js.native
    
    var swap: Double = js.native
    
    var zap_domain: Double = js.native
  }
  object SocketOptions {
    
    @scala.inline
    def apply(
      _fd: Double,
      _ioevents: Double,
      _receiveMore: Double,
      _subscribe: Double,
      _unsubscribe: Double,
      affinity: Double,
      backlog: Double,
      curve_publickey: Double,
      curve_secretkey: Double,
      curve_server: Double,
      curve_serverkey: Double,
      hwm: Double,
      identity: Double,
      last_endpoint: Double,
      linger: Double,
      mcast_loop: Double,
      mechanism: Double,
      plain_password: Double,
      plain_server: Double,
      plain_username: Double,
      rate: Double,
      rcvbuf: Double,
      reconnect_ivl: Double,
      recovery_ivl: Double,
      sndbuf: Double,
      swap: Double,
      zap_domain: Double
    ): SocketOptions = {
      val __obj = js.Dynamic.literal(_fd = _fd.asInstanceOf[js.Any], _ioevents = _ioevents.asInstanceOf[js.Any], _receiveMore = _receiveMore.asInstanceOf[js.Any], _subscribe = _subscribe.asInstanceOf[js.Any], _unsubscribe = _unsubscribe.asInstanceOf[js.Any], affinity = affinity.asInstanceOf[js.Any], backlog = backlog.asInstanceOf[js.Any], curve_publickey = curve_publickey.asInstanceOf[js.Any], curve_secretkey = curve_secretkey.asInstanceOf[js.Any], curve_server = curve_server.asInstanceOf[js.Any], curve_serverkey = curve_serverkey.asInstanceOf[js.Any], hwm = hwm.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], last_endpoint = last_endpoint.asInstanceOf[js.Any], linger = linger.asInstanceOf[js.Any], mcast_loop = mcast_loop.asInstanceOf[js.Any], mechanism = mechanism.asInstanceOf[js.Any], plain_password = plain_password.asInstanceOf[js.Any], plain_server = plain_server.asInstanceOf[js.Any], plain_username = plain_username.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any], rcvbuf = rcvbuf.asInstanceOf[js.Any], reconnect_ivl = reconnect_ivl.asInstanceOf[js.Any], recovery_ivl = recovery_ivl.asInstanceOf[js.Any], sndbuf = sndbuf.asInstanceOf[js.Any], swap = swap.asInstanceOf[js.Any], zap_domain = zap_domain.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketOptions]
    }
    
    @scala.inline
    implicit class SocketOptionsMutableBuilder[Self <: SocketOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAffinity(value: Double): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBacklog(value: Double): Self = StObject.set(x, "backlog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurve_publickey(value: Double): Self = StObject.set(x, "curve_publickey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurve_secretkey(value: Double): Self = StObject.set(x, "curve_secretkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurve_server(value: Double): Self = StObject.set(x, "curve_server", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurve_serverkey(value: Double): Self = StObject.set(x, "curve_serverkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHwm(value: Double): Self = StObject.set(x, "hwm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentity(value: Double): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_endpoint(value: Double): Self = StObject.set(x, "last_endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinger(value: Double): Self = StObject.set(x, "linger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMcast_loop(value: Double): Self = StObject.set(x, "mcast_loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMechanism(value: Double): Self = StObject.set(x, "mechanism", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlain_password(value: Double): Self = StObject.set(x, "plain_password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlain_server(value: Double): Self = StObject.set(x, "plain_server", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlain_username(value: Double): Self = StObject.set(x, "plain_username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRcvbuf(value: Double): Self = StObject.set(x, "rcvbuf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnect_ivl(value: Double): Self = StObject.set(x, "reconnect_ivl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecovery_ivl(value: Double): Self = StObject.set(x, "recovery_ivl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSndbuf(value: Double): Self = StObject.set(x, "sndbuf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwap(value: Double): Self = StObject.set(x, "swap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZap_domain(value: Double): Self = StObject.set(x, "zap_domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_fd(value: Double): Self = StObject.set(x, "_fd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_ioevents(value: Double): Self = StObject.set(x, "_ioevents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_receiveMore(value: Double): Self = StObject.set(x, "_receiveMore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_subscribe(value: Double): Self = StObject.set(x, "_subscribe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_unsubscribe(value: Double): Self = StObject.set(x, "_unsubscribe", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SocketTypes extends StObject {
    
    var dealer: Double = js.native
    
    var pair: Double = js.native
    
    var pub: Double = js.native
    
    var pull: Double = js.native
    
    var push: Double = js.native
    
    var rep: Double = js.native
    
    var req: Double = js.native
    
    var router: Double = js.native
    
    var stream: Double = js.native
    
    var sub: Double = js.native
    
    var xpub: Double = js.native
    
    var xrep: Double = js.native
    
    var xreq: Double = js.native
    
    var xsub: Double = js.native
  }
  object SocketTypes {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class SocketTypesMutableBuilder[Self <: SocketTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDealer(value: Double): Self = StObject.set(x, "dealer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPair(value: Double): Self = StObject.set(x, "pair", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPub(value: Double): Self = StObject.set(x, "pub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPull(value: Double): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPush(value: Double): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRep(value: Double): Self = StObject.set(x, "rep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReq(value: Double): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouter(value: Double): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStream(value: Double): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSub(value: Double): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXpub(value: Double): Self = StObject.set(x, "xpub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXrep(value: Double): Self = StObject.set(x, "xrep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXreq(value: Double): Self = StObject.set(x, "xreq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsub(value: Double): Self = StObject.set(x, "xsub", value.asInstanceOf[js.Any])
    }
  }
}
