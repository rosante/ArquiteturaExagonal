package com.ruzzante.arquiteturahexagonal.resource.car

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CarEntityRepository : JpaRepository<CarEntity, Long>