package typings
package zeromqLib.zeromqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zeromq", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ZMQ_AFFINITY: scala.Double = js.native
  val ZMQ_BACKLOG: scala.Double = js.native
  val ZMQ_CONNECT_TIMEOUT: scala.Double = js.native
  val ZMQ_CURVE_PUBLICKEY: scala.Double = js.native
  val ZMQ_CURVE_SECRETKEY: scala.Double = js.native
  val ZMQ_CURVE_SERVER: scala.Double = js.native
  val ZMQ_CURVE_SERVERKEY: scala.Double = js.native
  val ZMQ_DELAY_ATTACH_ON_CONNECT: scala.Double = js.native
  val ZMQ_EVENTS: scala.Double = js.native
  val ZMQ_FD: scala.Double = js.native
  val ZMQ_HEARTBEAT_IVL: scala.Double = js.native
  val ZMQ_HEARTBEAT_TIMEOUT: scala.Double = js.native
  val ZMQ_HEARTBEAT_TTL: scala.Double = js.native
  val ZMQ_HWM: scala.Double = js.native
  val ZMQ_IDENTITY: scala.Double = js.native
  val ZMQ_IO_THREADS: scala.Double = js.native
  val ZMQ_IPV4ONLY: scala.Double = js.native
  val ZMQ_IPV6: scala.Double = js.native
  val ZMQ_LAST_ENDPOINT: scala.Double = js.native
  val ZMQ_LINGER: scala.Double = js.native
  val ZMQ_MAXMSGSIZE: scala.Double = js.native
  val ZMQ_MAX_SOCKETS: scala.Double = js.native
  val ZMQ_MCAST_LOOP: scala.Double = js.native
  val ZMQ_MECHANISM: scala.Double = js.native
  val ZMQ_MULTICAST_HOPS: scala.Double = js.native
  val ZMQ_PLAIN_PASSWORD: scala.Double = js.native
  val ZMQ_PLAIN_SERVER: scala.Double = js.native
  val ZMQ_PLAIN_USERNAME: scala.Double = js.native
  val ZMQ_RATE: scala.Double = js.native
  val ZMQ_RCVBUF: scala.Double = js.native
  val ZMQ_RCVHWM: scala.Double = js.native
  val ZMQ_RCVMORE: scala.Double = js.native
  val ZMQ_RCVTIMEO: scala.Double = js.native
  val ZMQ_RECONNECT_IVL: scala.Double = js.native
  val ZMQ_RECONNECT_IVL_MAX: scala.Double = js.native
  val ZMQ_RECOVERY_IVL: scala.Double = js.native
  val ZMQ_RECOVERY_IVL_MSEC: scala.Double = js.native
  val ZMQ_ROUTER_HANDOVER: scala.Double = js.native
  val ZMQ_ROUTER_MANDATORY: scala.Double = js.native
  val ZMQ_ROUTER_RAW: scala.Double = js.native
  val ZMQ_SNDBUF: scala.Double = js.native
  val ZMQ_SNDHWM: scala.Double = js.native
  val ZMQ_SNDTIMEO: scala.Double = js.native
  val ZMQ_SUBSCRIBE: scala.Double = js.native
  val ZMQ_SWAP: scala.Double = js.native
  val ZMQ_TCP_ACCEPT_FILTER: scala.Double = js.native
  val ZMQ_TCP_KEEPALIVE: scala.Double = js.native
  val ZMQ_TCP_KEEPALIVE_CNT: scala.Double = js.native
  val ZMQ_TCP_KEEPALIVE_IDLE: scala.Double = js.native
  val ZMQ_TCP_KEEPALIVE_INTVL: scala.Double = js.native
  val ZMQ_TYPE: scala.Double = js.native
  val ZMQ_UNSUBSCRIBE: scala.Double = js.native
  val ZMQ_XPUB_VERBOSE: scala.Double = js.native
  val ZMQ_ZAP_DOMAIN: scala.Double = js.native
  var options: zeromqLib.zeromqMod.SocketOptions = js.native
  var types: zeromqLib.zeromqMod.SocketTypes = js.native
  var version: java.lang.String = js.native
  def createSocket(`type`: java.lang.String): zeromqLib.zeromqMod.Socket = js.native
  def createSocket(`type`: java.lang.String, options: js.Any): zeromqLib.zeromqMod.Socket = js.native
  def curveKeypair(): zeromqLib.zeromqMod.CurveKeyPair = js.native
  def proxy(frontend: zeromqLib.zeromqMod.Socket, backend: zeromqLib.zeromqMod.Socket): scala.Unit = js.native
  def proxy(
    frontend: zeromqLib.zeromqMod.Socket,
    backend: zeromqLib.zeromqMod.Socket,
    capture: zeromqLib.zeromqMod.Socket
  ): scala.Unit = js.native
  def socket(`type`: java.lang.String): zeromqLib.zeromqMod.Socket = js.native
  def socket(`type`: java.lang.String, options: js.Any): zeromqLib.zeromqMod.Socket = js.native
  def socket(`type`: scala.Double): zeromqLib.zeromqMod.Socket = js.native
  def socket(`type`: scala.Double, options: js.Any): zeromqLib.zeromqMod.Socket = js.native
}

