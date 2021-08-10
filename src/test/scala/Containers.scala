import com.dimafeng.testcontainers.GenericContainer
import com.dimafeng.testcontainers.GenericContainer.DockerImage
import org.testcontainers.containers.wait.strategy.Wait

object Containers {

  case class EventstoreContainer(
    dockerImageName: DockerImage = DockerImage(Left("eventstore/eventstore:release-5.0.8"))
  ) extends GenericContainer(
    dockerImage = dockerImageName,
    exposedPorts = Seq(1113),
    waitStrategy = Some(Wait.forListeningPort())
  )

  case class NginxContainer(
    dockerImageName: DockerImage = DockerImage(Left("nginx:latest"))
  ) extends GenericContainer(
    dockerImage = dockerImageName,
    exposedPorts = Seq(80),
    waitStrategy = Some(Wait.forHttp("/"))
  )


}
