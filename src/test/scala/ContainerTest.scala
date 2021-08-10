import Containers.NginxContainer
import org.scalatest.funsuite.AnyFunSuite


class ContainerTest extends AnyFunSuite {

  test("should start nginx") {
    val nginxContainer = NginxContainer()
    nginxContainer.start()
    val ipAddress = nginxContainer.containerIpAddress
    val port = nginxContainer.mappedPort(80)
    println(s"nginx url: http://$ipAddress:$port")
    nginxContainer.stop()
  }

}
