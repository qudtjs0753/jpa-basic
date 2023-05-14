package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
@RequiredArgsConstructor
public class OrderRepository {

    private final EntityManager em;

    public void save(Order order) {
        em.persist(order);
    }

    //차후 동적쿼리를 사용해 따로 설명하게 될 것
    public Order findOne(Long id) {
        return em.find(Order.class, id);
    }

    //public List<Order> findAll(OrderSearch orderSearch){}
}
