package thminiproject.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import thminiproject.domain.*;

@Component
public class SubscriberHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Subscriber>> {

    @Override
    public EntityModel<Subscriber> process(EntityModel<Subscriber> model) {
        return model;
    }
}
