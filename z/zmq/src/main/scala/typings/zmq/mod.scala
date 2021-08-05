package typings.zmq

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zmq", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("zmq", "Socket")
  @js.native
  class Socket ()
    extends StObject
       with EventEmitter {
    
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
    def bind(addr: String): Socket = js.native
    def bind(addr: String, callback: js.Function1[/* error */ String, Unit]): Socket = js.native
    
    /**
      * Sync bind.
      *
      * @param addr Socket address
      */
    def bindSync(addr: String): Socket = js.native
    
    /**
      * Close the socket.
      *
      */
    def close(): Socket = js.native
    
    /**
      * Connect to `addr`.
      *
      * @param addr Connection address
      */
    def connect(addr: String): Socket = js.native
    
    /**
      * Disconnect from `addr`.
      *
      * @param addr The address
      */
    def disconnect(addr: String): Socket = js.native
    
    /**
      * Get socket `opt`.
      *
      * @param opt Option string
      */
    def getsocketopt(opt: String): js.Any = js.native
    /**
      * Get socket `opt`.
      *
      * @param opt Option number
      */
    def getsocketopt(opt: Double): js.Any = js.native
    
    var hwm: js.Any = js.native
    
    var identity: js.Any = js.native
    
    var last_endpoint: js.Any = js.native
    
    var linger: js.Any = js.native
    
    var mcast_loop: js.Any = js.native
    
    /**
      * Enable monitoring of a Socket
      *
      * @param {Number} timer interval in ms > 0 or Undefined for default
      * @return {Socket} for chaining
      */
    def monitor(): Socket = js.native
    def monitor(interval: Double): Socket = js.native
    
    /**
      * Socket event
      * @param eventName {string}
      * @param callback {Function}
      */
    def on(eventName: String, callback: js.Function1[/* repeated */ Buffer, Unit]): Unit = js.native
    
    def pause(): Unit = js.native
    
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
    def send(msg: String): Socket = js.native
    def send(msg: String, flags: Double): Socket = js.native
    /**
      * Send the given `msg`.
      *
      * @param msg The message
      * @param flags Message flags
      */
    def send(msg: js.Array[js.Any]): Socket = js.native
    def send(msg: js.Array[js.Any], flags: Double): Socket = js.native
    /**
      * Send the given `msg`.
      *
      * @param msg {Buffer} The message
      * @param flags {number} Optional message flags
      */
    def send(msg: Buffer): Socket = js.native
    def send(msg: Buffer, flags: Double): Socket = js.native
    
    /**
      * Set `opt` to `val`.
      *
      * @param opt Option
      * @param val Value
      */
    def setsocketopt(opt: String, `val`: js.Any): Socket = js.native
    /**
      * Set `opt` to `val`.
      *
      * @param opt Option
      * @param val Value
      */
    def setsocketopt(opt: Double, `val`: js.Any): Socket = js.native
    
    var sndbuf: js.Any = js.native
    
    /**
      * Subscribe with the given `filter`.
      *
      * @param filter The filter
      */
    def subscribe(filter: String): Socket = js.native
    
    var swap: js.Any = js.native
    
    /**
      * Async unbind.
      *
      * Emits the "unbind" event.
      *
      * @param addr Socket address
      * @param cb Unind callback
      */
    def unbind(addr: String): Socket = js.native
    def unbind(addr: String, callback: js.Function1[/* error */ String, Unit]): Socket = js.native
    
    /**
      * Sync unbind.
      *
      * @param addr Socket address
      */
    def unbindSync(addr: String): Socket = js.native
    
    /**
      * Unsubscribe with the given `filter`.
      *
      * @param filter The filter
      */
    def unsubscribe(filter: String): Socket = js.native
  }
  
  @JSImport("zmq", "options")
  @js.native
  def options: SocketOptions = js.native
  inline def options_=(x: SocketOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  
  @JSImport("zmq", "types")
  @js.native
  def types: SocketTypes = js.native
  inline def types_=(x: SocketTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("types")(x.asInstanceOf[js.Any])
  
  @JSImport("zmq", "version")
  @js.native
  def version: String = js.native
  inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  trait EventEmitter extends StObject
  
  trait SocketOptions extends StObject {
    
    var _fd: Double
    
    var _ioevents: Double
    
    var _receiveMore: Double
    
    var _subscribe: Double
    
    var _unsubscribe: Double
    
    var affinity: Double
    
    var backlog: Double
    
    var hwm: Double
    
    var identity: Double
    
    var last_endpoint: Double
    
    var linger: Double
    
    var mcast_loop: Double
    
    var rate: Double
    
    var rcvbuf: Double
    
    var reconnect_ivl: Double
    
    var recovery_ivl: Double
    
    var sndbuf: Double
    
    var swap: Double
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
      hwm: Double,
      identity: Double,
      last_endpoint: Double,
      linger: Double,
      mcast_loop: Double,
      rate: Double,
      rcvbuf: Double,
      reconnect_ivl: Double,
      recovery_ivl: Double,
      sndbuf: Double,
      swap: Double
    ): SocketOptions = {
      val __obj = js.Dynamic.literal(_fd = _fd.asInstanceOf[js.Any], _ioevents = _ioevents.asInstanceOf[js.Any], _receiveMore = _receiveMore.asInstanceOf[js.Any], _subscribe = _subscribe.asInstanceOf[js.Any], _unsubscribe = _unsubscribe.asInstanceOf[js.Any], affinity = affinity.asInstanceOf[js.Any], backlog = backlog.asInstanceOf[js.Any], hwm = hwm.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], last_endpoint = last_endpoint.asInstanceOf[js.Any], linger = linger.asInstanceOf[js.Any], mcast_loop = mcast_loop.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any], rcvbuf = rcvbuf.asInstanceOf[js.Any], reconnect_ivl = reconnect_ivl.asInstanceOf[js.Any], recovery_ivl = recovery_ivl.asInstanceOf[js.Any], sndbuf = sndbuf.asInstanceOf[js.Any], swap = swap.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketOptions]
    }
    
    extension [Self <: SocketOptions](x: Self) {
      
      inline def setAffinity(value: Double): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
      
      inline def setBacklog(value: Double): Self = StObject.set(x, "backlog", value.asInstanceOf[js.Any])
      
      inline def setHwm(value: Double): Self = StObject.set(x, "hwm", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: Double): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setLast_endpoint(value: Double): Self = StObject.set(x, "last_endpoint", value.asInstanceOf[js.Any])
      
      inline def setLinger(value: Double): Self = StObject.set(x, "linger", value.asInstanceOf[js.Any])
      
      inline def setMcast_loop(value: Double): Self = StObject.set(x, "mcast_loop", value.asInstanceOf[js.Any])
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setRcvbuf(value: Double): Self = StObject.set(x, "rcvbuf", value.asInstanceOf[js.Any])
      
      inline def setReconnect_ivl(value: Double): Self = StObject.set(x, "reconnect_ivl", value.asInstanceOf[js.Any])
      
      inline def setRecovery_ivl(value: Double): Self = StObject.set(x, "recovery_ivl", value.asInstanceOf[js.Any])
      
      inline def setSndbuf(value: Double): Self = StObject.set(x, "sndbuf", value.asInstanceOf[js.Any])
      
      inline def setSwap(value: Double): Self = StObject.set(x, "swap", value.asInstanceOf[js.Any])
      
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
      sub: Double,
      xpub: Double,
      xrep: Double,
      xreq: Double,
      xsub: Double
    ): SocketTypes = {
      val __obj = js.Dynamic.literal(dealer = dealer.asInstanceOf[js.Any], pair = pair.asInstanceOf[js.Any], pub = pub.asInstanceOf[js.Any], pull = pull.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], rep = rep.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], xpub = xpub.asInstanceOf[js.Any], xrep = xrep.asInstanceOf[js.Any], xreq = xreq.asInstanceOf[js.Any], xsub = xsub.asInstanceOf[js.Any])
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
      
      inline def setSub(value: Double): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setXpub(value: Double): Self = StObject.set(x, "xpub", value.asInstanceOf[js.Any])
      
      inline def setXrep(value: Double): Self = StObject.set(x, "xrep", value.asInstanceOf[js.Any])
      
      inline def setXreq(value: Double): Self = StObject.set(x, "xreq", value.asInstanceOf[js.Any])
      
      inline def setXsub(value: Double): Self = StObject.set(x, "xsub", value.asInstanceOf[js.Any])
    }
  }
}
