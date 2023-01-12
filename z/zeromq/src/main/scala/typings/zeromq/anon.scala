package typings.zeromq

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<zeromq.zeromq.SocketOptions> */
  trait PartialSocketOptions extends StObject {
    
    var _fd: js.UndefOr[Double] = js.undefined
    
    var _ioevents: js.UndefOr[Double] = js.undefined
    
    var _receiveMore: js.UndefOr[Double] = js.undefined
    
    var _subscribe: js.UndefOr[Double] = js.undefined
    
    var _unsubscribe: js.UndefOr[Double] = js.undefined
    
    var affinity: js.UndefOr[Double] = js.undefined
    
    var backlog: js.UndefOr[Double] = js.undefined
    
    var connect_timeout: js.UndefOr[Double] = js.undefined
    
    var curve_publickey: js.UndefOr[String | Buffer] = js.undefined
    
    var curve_secretkey: js.UndefOr[String | Buffer] = js.undefined
    
    var curve_server: js.UndefOr[Double] = js.undefined
    
    var curve_serverkey: js.UndefOr[String | Buffer] = js.undefined
    
    var heartbeat_ivl: js.UndefOr[Double] = js.undefined
    
    var heartbeat_timeout: js.UndefOr[Double] = js.undefined
    
    var heartbeat_ttl: js.UndefOr[Double] = js.undefined
    
    var hwm: js.UndefOr[Double] = js.undefined
    
    var identity: js.UndefOr[Double] = js.undefined
    
    var last_endpoint: js.UndefOr[Double] = js.undefined
    
    var linger: js.UndefOr[Double] = js.undefined
    
    var mcast_loop: js.UndefOr[Double] = js.undefined
    
    var mechanism: js.UndefOr[Double] = js.undefined
    
    var plain_password: js.UndefOr[String] = js.undefined
    
    var plain_server: js.UndefOr[Double] = js.undefined
    
    var plain_username: js.UndefOr[String] = js.undefined
    
    var rate: js.UndefOr[Double] = js.undefined
    
    var rcvbuf: js.UndefOr[Double] = js.undefined
    
    var reconnect_ivl: js.UndefOr[Double] = js.undefined
    
    var recovery_ivl: js.UndefOr[Double] = js.undefined
    
    var sndbuf: js.UndefOr[Double] = js.undefined
    
    var swap: js.UndefOr[Double] = js.undefined
    
    var zap_domain: js.UndefOr[String] = js.undefined
  }
  object PartialSocketOptions {
    
    inline def apply(): PartialSocketOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSocketOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialSocketOptions] (val x: Self) extends AnyVal {
      
      inline def setAffinity(value: Double): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
      
      inline def setAffinityUndefined: Self = StObject.set(x, "affinity", js.undefined)
      
      inline def setBacklog(value: Double): Self = StObject.set(x, "backlog", value.asInstanceOf[js.Any])
      
      inline def setBacklogUndefined: Self = StObject.set(x, "backlog", js.undefined)
      
      inline def setConnect_timeout(value: Double): Self = StObject.set(x, "connect_timeout", value.asInstanceOf[js.Any])
      
      inline def setConnect_timeoutUndefined: Self = StObject.set(x, "connect_timeout", js.undefined)
      
      inline def setCurve_publickey(value: String | Buffer): Self = StObject.set(x, "curve_publickey", value.asInstanceOf[js.Any])
      
      inline def setCurve_publickeyUndefined: Self = StObject.set(x, "curve_publickey", js.undefined)
      
      inline def setCurve_secretkey(value: String | Buffer): Self = StObject.set(x, "curve_secretkey", value.asInstanceOf[js.Any])
      
      inline def setCurve_secretkeyUndefined: Self = StObject.set(x, "curve_secretkey", js.undefined)
      
      inline def setCurve_server(value: Double): Self = StObject.set(x, "curve_server", value.asInstanceOf[js.Any])
      
      inline def setCurve_serverUndefined: Self = StObject.set(x, "curve_server", js.undefined)
      
      inline def setCurve_serverkey(value: String | Buffer): Self = StObject.set(x, "curve_serverkey", value.asInstanceOf[js.Any])
      
      inline def setCurve_serverkeyUndefined: Self = StObject.set(x, "curve_serverkey", js.undefined)
      
      inline def setHeartbeat_ivl(value: Double): Self = StObject.set(x, "heartbeat_ivl", value.asInstanceOf[js.Any])
      
      inline def setHeartbeat_ivlUndefined: Self = StObject.set(x, "heartbeat_ivl", js.undefined)
      
      inline def setHeartbeat_timeout(value: Double): Self = StObject.set(x, "heartbeat_timeout", value.asInstanceOf[js.Any])
      
      inline def setHeartbeat_timeoutUndefined: Self = StObject.set(x, "heartbeat_timeout", js.undefined)
      
      inline def setHeartbeat_ttl(value: Double): Self = StObject.set(x, "heartbeat_ttl", value.asInstanceOf[js.Any])
      
      inline def setHeartbeat_ttlUndefined: Self = StObject.set(x, "heartbeat_ttl", js.undefined)
      
      inline def setHwm(value: Double): Self = StObject.set(x, "hwm", value.asInstanceOf[js.Any])
      
      inline def setHwmUndefined: Self = StObject.set(x, "hwm", js.undefined)
      
      inline def setIdentity(value: Double): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setLast_endpoint(value: Double): Self = StObject.set(x, "last_endpoint", value.asInstanceOf[js.Any])
      
      inline def setLast_endpointUndefined: Self = StObject.set(x, "last_endpoint", js.undefined)
      
      inline def setLinger(value: Double): Self = StObject.set(x, "linger", value.asInstanceOf[js.Any])
      
      inline def setLingerUndefined: Self = StObject.set(x, "linger", js.undefined)
      
      inline def setMcast_loop(value: Double): Self = StObject.set(x, "mcast_loop", value.asInstanceOf[js.Any])
      
      inline def setMcast_loopUndefined: Self = StObject.set(x, "mcast_loop", js.undefined)
      
      inline def setMechanism(value: Double): Self = StObject.set(x, "mechanism", value.asInstanceOf[js.Any])
      
      inline def setMechanismUndefined: Self = StObject.set(x, "mechanism", js.undefined)
      
      inline def setPlain_password(value: String): Self = StObject.set(x, "plain_password", value.asInstanceOf[js.Any])
      
      inline def setPlain_passwordUndefined: Self = StObject.set(x, "plain_password", js.undefined)
      
      inline def setPlain_server(value: Double): Self = StObject.set(x, "plain_server", value.asInstanceOf[js.Any])
      
      inline def setPlain_serverUndefined: Self = StObject.set(x, "plain_server", js.undefined)
      
      inline def setPlain_username(value: String): Self = StObject.set(x, "plain_username", value.asInstanceOf[js.Any])
      
      inline def setPlain_usernameUndefined: Self = StObject.set(x, "plain_username", js.undefined)
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
      
      inline def setRcvbuf(value: Double): Self = StObject.set(x, "rcvbuf", value.asInstanceOf[js.Any])
      
      inline def setRcvbufUndefined: Self = StObject.set(x, "rcvbuf", js.undefined)
      
      inline def setReconnect_ivl(value: Double): Self = StObject.set(x, "reconnect_ivl", value.asInstanceOf[js.Any])
      
      inline def setReconnect_ivlUndefined: Self = StObject.set(x, "reconnect_ivl", js.undefined)
      
      inline def setRecovery_ivl(value: Double): Self = StObject.set(x, "recovery_ivl", value.asInstanceOf[js.Any])
      
      inline def setRecovery_ivlUndefined: Self = StObject.set(x, "recovery_ivl", js.undefined)
      
      inline def setSndbuf(value: Double): Self = StObject.set(x, "sndbuf", value.asInstanceOf[js.Any])
      
      inline def setSndbufUndefined: Self = StObject.set(x, "sndbuf", js.undefined)
      
      inline def setSwap(value: Double): Self = StObject.set(x, "swap", value.asInstanceOf[js.Any])
      
      inline def setSwapUndefined: Self = StObject.set(x, "swap", js.undefined)
      
      inline def setZap_domain(value: String): Self = StObject.set(x, "zap_domain", value.asInstanceOf[js.Any])
      
      inline def setZap_domainUndefined: Self = StObject.set(x, "zap_domain", js.undefined)
      
      inline def set_fd(value: Double): Self = StObject.set(x, "_fd", value.asInstanceOf[js.Any])
      
      inline def set_fdUndefined: Self = StObject.set(x, "_fd", js.undefined)
      
      inline def set_ioevents(value: Double): Self = StObject.set(x, "_ioevents", value.asInstanceOf[js.Any])
      
      inline def set_ioeventsUndefined: Self = StObject.set(x, "_ioevents", js.undefined)
      
      inline def set_receiveMore(value: Double): Self = StObject.set(x, "_receiveMore", value.asInstanceOf[js.Any])
      
      inline def set_receiveMoreUndefined: Self = StObject.set(x, "_receiveMore", js.undefined)
      
      inline def set_subscribe(value: Double): Self = StObject.set(x, "_subscribe", value.asInstanceOf[js.Any])
      
      inline def set_subscribeUndefined: Self = StObject.set(x, "_subscribe", js.undefined)
      
      inline def set_unsubscribe(value: Double): Self = StObject.set(x, "_unsubscribe", value.asInstanceOf[js.Any])
      
      inline def set_unsubscribeUndefined: Self = StObject.set(x, "_unsubscribe", js.undefined)
    }
  }
}
