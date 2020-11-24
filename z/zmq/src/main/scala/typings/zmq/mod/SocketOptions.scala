package typings.zmq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocketOptions extends js.Object {
  
  var _fd: Double = js.native
  
  var _ioevents: Double = js.native
  
  var _receiveMore: Double = js.native
  
  var _subscribe: Double = js.native
  
  var _unsubscribe: Double = js.native
  
  var affinity: Double = js.native
  
  var backlog: Double = js.native
  
  var hwm: Double = js.native
  
  var identity: Double = js.native
  
  var last_endpoint: Double = js.native
  
  var linger: Double = js.native
  
  var mcast_loop: Double = js.native
  
  var rate: Double = js.native
  
  var rcvbuf: Double = js.native
  
  var reconnect_ivl: Double = js.native
  
  var recovery_ivl: Double = js.native
  
  var sndbuf: Double = js.native
  
  var swap: Double = js.native
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
  
  @scala.inline
  implicit class SocketOptionsOps[Self <: SocketOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_fd(value: Double): Self = this.set("_fd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ioevents(value: Double): Self = this.set("_ioevents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_receiveMore(value: Double): Self = this.set("_receiveMore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_subscribe(value: Double): Self = this.set("_subscribe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_unsubscribe(value: Double): Self = this.set("_unsubscribe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffinity(value: Double): Self = this.set("affinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBacklog(value: Double): Self = this.set("backlog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHwm(value: Double): Self = this.set("hwm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentity(value: Double): Self = this.set("identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_endpoint(value: Double): Self = this.set("last_endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinger(value: Double): Self = this.set("linger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMcast_loop(value: Double): Self = this.set("mcast_loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRate(value: Double): Self = this.set("rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRcvbuf(value: Double): Self = this.set("rcvbuf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReconnect_ivl(value: Double): Self = this.set("reconnect_ivl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecovery_ivl(value: Double): Self = this.set("recovery_ivl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSndbuf(value: Double): Self = this.set("sndbuf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwap(value: Double): Self = this.set("swap", value.asInstanceOf[js.Any])
  }
}
